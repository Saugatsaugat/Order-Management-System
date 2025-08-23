package com.saugat.ordermanagementsystem.config;

import com.saugat.ordermanagementsystem.exceptions.CustomAccessDeniedHandler;
import com.saugat.ordermanagementsystem.exceptions.CustomBasicAuthenticationEntryPoint;
import com.saugat.ordermanagementsystem.filter.AuthoritiesLoggingAfterFilter;
import com.saugat.ordermanagementsystem.filter.CsrfCookieFilter;
import com.saugat.ordermanagementsystem.filter.RequestValidationBeforeFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.authentication.password.CompromisedPasswordChecker;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.password.HaveIBeenPwnedRestApiPasswordChecker;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.csrf.CsrfTokenRequestAttributeHandler;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Collections;

@Configuration
@Profile("prod")
public class ProdSpringConfig {

    private final AuthorizationRules authorizationRules;

    public ProdSpringConfig(AuthorizationRules authorizationRules) {
        this.authorizationRules = authorizationRules;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
        CsrfTokenRequestAttributeHandler requestAttributeHandler = new CsrfTokenRequestAttributeHandler();
        requestAttributeHandler.setCsrfRequestAttributeName("_csrf");

        httpSecurity
                .sessionManagement(smc->smc.sessionFixation(sf->sf.newSession())
                        .invalidSessionUrl("/invalidSession").maximumSessions(1)
                        .maxSessionsPreventsLogin(false))

                .csrf(csrf->csrf.csrfTokenRequestHandler(requestAttributeHandler).ignoringRequestMatchers("/login", "/register")
                        .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()))
                        .addFilterAfter(new CsrfCookieFilter(), BasicAuthenticationFilter.class)

                .addFilterBefore(new RequestValidationBeforeFilter(), BasicAuthenticationFilter.class)
                .addFilterAfter(new AuthoritiesLoggingAfterFilter(), BasicAuthenticationFilter.class)

                .authorizeHttpRequests((request) -> {
                    authorizationRules.configureRoles(request);
                    authorizationRules.configureAuthorities(request);
                    authorizationRules.configureOther(request);
                    request.anyRequest().authenticated();
                        })

                .formLogin(Customizer.withDefaults())
                .httpBasic(ebc -> ebc.authenticationEntryPoint(new CustomBasicAuthenticationEntryPoint()))
                .logout(loc -> loc.logoutSuccessUrl("/login?logout=true").invalidateHttpSession(true).clearAuthentication(true)
                        .deleteCookies("JSESSIONID"))
                .exceptionHandling(ehc -> ehc.accessDeniedHandler(new CustomAccessDeniedHandler()))
        ;
        return httpSecurity.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    @Bean
    public CompromisedPasswordChecker compromisedPasswordChecker(){
        return new HaveIBeenPwnedRestApiPasswordChecker();
    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource(){
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowedOrigins(Collections.singletonList("http://localhost:8080"));
        corsConfiguration.setAllowedMethods(Collections.singletonList("*"));
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.setAllowedHeaders(Collections.singletonList("*"));
        corsConfiguration.setMaxAge(3600L);

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", corsConfiguration);
        return source;
    }
}

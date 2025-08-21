package com.saugat.ordermanagementsystem.config;

import com.saugat.ordermanagementsystem.exceptions.CustomBasicAuthenticationEntryPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.authentication.password.CompromisedPasswordChecker;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.password.HaveIBeenPwnedRestApiPasswordChecker;

@Configuration
@Profile("prod")
public class ProdSpringConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
        httpSecurity
                .csrf(AbstractHttpConfigurer::disable)      //csrf disabled
                .authorizeHttpRequests((request) -> request
                        .requestMatchers("/address/**", "/category/**", "/customer/**", "/employee/**", "/inventory/**",
                                "/inventoryLog/**","/order/**", "/orderDetail/**", "/product/**", "/shipper/**", "/supplier/**",
                                "/customerAddress/**","/employeeAddress/**", "/supplierAddress/**", "/userRole**").authenticated()
                                .requestMatchers("/user/**").permitAll()
                        )
                .formLogin(Customizer.withDefaults())
                .httpBasic(ebc -> ebc.authenticationEntryPoint(new CustomBasicAuthenticationEntryPoint()));
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


}

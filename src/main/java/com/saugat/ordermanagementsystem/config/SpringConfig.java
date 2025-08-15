package com.saugat.ordermanagementsystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SpringConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.authorizeHttpRequests((request) -> request
//                                .requestMatchers("/**").permitAll()
                                .requestMatchers("/user/**").permitAll()
                        .requestMatchers("/address", "/category", "/customer", "/employee", "/inventory", "/inventoryLog",
                                "/order", "/orderDetail", "/product", "shipper", "/supplier", "/customerAddress",
                                "/employeeAddress", "/supplierAddress", "/userRole").authenticated()
                        )
                .formLogin(AbstractHttpConfigurer::disable)
                .httpBasic(AbstractHttpConfigurer::disable);
        return httpSecurity.build();
    }


}

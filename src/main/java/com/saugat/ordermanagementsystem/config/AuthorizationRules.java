package com.saugat.ordermanagementsystem.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.stereotype.Component;

@Component
public class AuthorizationRules {
    public void configureAuthorities(AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry http){

                http
                //Address
                .requestMatchers("/address/**").authenticated()

                //Category
                .requestMatchers("/category/**").authenticated()

                //Customer
                .requestMatchers("/customer/**").authenticated()

                //Employee
                .requestMatchers("/employee/**").authenticated()

                //Inventory
                .requestMatchers("/inventory/**").authenticated()

                //InventoryLog
                .requestMatchers("/inventoryLog/**").authenticated()

                //Order
                .requestMatchers("/order/**").authenticated()

                //OrderDetail
                .requestMatchers("/orderDetail/**").authenticated()

                //Product
                .requestMatchers("/product/**").authenticated()

                //Shipper
                .requestMatchers("/shipper/**").authenticated()

                //Supplier
                .requestMatchers("/supplier/**").authenticated()

                //CustomerAddress
                .requestMatchers("/customerAddress/**").authenticated()

                //EmployeeAddress
                .requestMatchers("/employeeAddress/**").authenticated()

                //SupplierAddress
                .requestMatchers("/supplierAddress/**").authenticated()

                //UserRole
                .requestMatchers("/userRole/**").authenticated();


    }

    public void configureRoles(AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry http){
        http.requestMatchers(
                "/address/**",
                "/category/**",
                "/customer/**",
                "/employee/**",
                "/inventory/**",
                "/inventoryLog/**",
                "/order/**",
                "/orderDetail/**",
                "/product/**",
                "/shipper/**",
                "/supplier/**",
                "/customerAddress/**",
                "/employeeAddress/**",
                "/supplierAddress/**",
                "/userRole/**",
                "/sayHello")
                .hasAnyRole("EMPLOYEE", "ADMIN");
    }

    public void configureOther(AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry http){
        http
            .requestMatchers("/user/login", "/user/register", "/invalidSession").permitAll();
    }
}

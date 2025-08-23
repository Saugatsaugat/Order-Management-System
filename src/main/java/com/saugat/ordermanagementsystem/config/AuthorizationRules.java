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
                .requestMatchers("/category/**").hasAuthority("VIEW_CATEGORY")

                //Customer
                .requestMatchers("/customer/**").hasAuthority("VIEW_CUSTOMER")

                //Employee
                .requestMatchers("/employee/**").hasAuthority("VIEW_EMPLOYEE")

                //Inventory
                .requestMatchers("/inventory/**").hasAuthority("VIEW_INVENTORY")

                //InventoryLog
                .requestMatchers("/inventoryLog/**").hasAuthority("VIEW_INVENTORY_lOG")

                //Order
                .requestMatchers("/order/**").hasAuthority("VIEW_ORDER")

                //OrderDetail
                .requestMatchers("/orderDetail/**").hasAuthority("VIEW_ORDER_DETAIL")

                //Product
                .requestMatchers("/product/**").hasAuthority("VIEW_PRODUCT")

                //Shipper
                .requestMatchers("/shipper/**").hasAuthority("VIEW_SHIPPER")

                //Supplier
                .requestMatchers("/supplier/**").hasAuthority("VIEW_SUPPLIER")

                //CustomerAddress
                .requestMatchers("/customerAddress/**").hasAuthority("VIEW_CUSTOMER_ADDRESS")

                //EmployeeAddress
                .requestMatchers("/employeeAddress/**").hasAuthority("VIEW_EMPLOYEE_ADDRESS")

                //SupplierAddress
                .requestMatchers("/supplierAddress/**").hasAuthority("VIEW_SUPPLIER_ADDRESS");
    }

    public void configureRoles(AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry http){
        http.requestMatchers("/address/**","/category/**","/customer/**","/employee/**","/inventory/**","/inventoryLog/**",
                "/order/**","/orderDetail/**", "/product/**","/shipper/**","/supplier/**","/customerAddress/**","/employeeAddress/**",
                "/supplierAddress/**").hasAnyRole("ADMIN", "USER");
    }

    public void configureOther(AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry http){
        http
            .requestMatchers("/userRole/**").authenticated()
            .requestMatchers("/user/**","/sayHello", "/invalidSession").permitAll();
    }
}

package com.saugat.ordermanagementsystem.controller;

import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @PreAuthorize("hasRole('EMPLOYEE')")
    @PostAuthorize("hasAuthority('VIEW_EMPLOYEE')")
    @GetMapping("/sayHello")
    public String sayHello(){
        return "Hello";
    }
}

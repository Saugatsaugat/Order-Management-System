package com.saugat.ordermanagementsystem.controller;

import com.saugat.ordermanagementsystem.service.CustomerService;
import com.saugat.ordermanagementsystem.service.IService;
import com.saugat.ordermanagementsystem.wrapper.CustomerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("customerController")
@RequestMapping("/controller")
public class CustomerController extends AbstractController<CustomerVo> {

    @Autowired
    private CustomerService service;

    @Override
    protected IService<CustomerVo> getService() {
        return null;
    }

    @GetMapping("/ping")
    public String pingMe(){
        return "Customer";
    }
}

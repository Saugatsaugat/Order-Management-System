package com.saugat.ordermanagementsystem.controller;

import com.saugat.ordermanagementsystem.service.CustomerService;
import com.saugat.ordermanagementsystem.service.IService;
import com.saugat.ordermanagementsystem.wrapper.CustomerVo;
import com.saugat.ordermanagementsystem.wrapper.api.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("customerController")
@RequestMapping("/customer")
public class CustomerController extends AbstractController<CustomerVo> {

    @Autowired
    private CustomerService service;

    @Override
    protected IService<CustomerVo> getService() {
        return service;
    }

    @GetMapping("/ping")
    public String pingMe(){
        return "Customer";
    }

    @Override
    public ResponseEntity<ApiResponse<CustomerVo>> create(@RequestBody CustomerVo vo){
        return getService().create(vo);
    }
}

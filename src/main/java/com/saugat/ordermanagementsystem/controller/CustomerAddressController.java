package com.saugat.ordermanagementsystem.controller;

import com.saugat.ordermanagementsystem.service.CustomerAddressService;
import com.saugat.ordermanagementsystem.service.IService;
import com.saugat.ordermanagementsystem.wrapper.CustomerAddressVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("customerAddressController")
@RequestMapping("/customerAddress")
public class CustomerAddressController extends AbstractController<CustomerAddressVo> {

    @Autowired
    private CustomerAddressService service;

    @Override
    protected IService getService() {
        return service;
    }
}

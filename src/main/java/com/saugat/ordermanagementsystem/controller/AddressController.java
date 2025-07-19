package com.saugat.ordermanagementsystem.controller;

import com.saugat.ordermanagementsystem.service.AddressService;
import com.saugat.ordermanagementsystem.service.IService;
import com.saugat.ordermanagementsystem.wrapper.AddressVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("addressController")
@RequestMapping("/address")
public class AddressController extends AbstractController<AddressVo> {

    @Autowired
    private AddressService service;

    @Override
    protected IService<AddressVo> getService() {
        return service;
    }

    @GetMapping("/ping")
    public String pingMe(){
        return "Address";
    }
}

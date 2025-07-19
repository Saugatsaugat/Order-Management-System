package com.saugat.ordermanagementsystem.controller;

import com.saugat.ordermanagementsystem.service.EmployeeAddressService;
import com.saugat.ordermanagementsystem.service.IService;
import com.saugat.ordermanagementsystem.wrapper.EmployeeAddressVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("employeeAddressController")
@RequestMapping("/employeeAddress")
public class EmployeeAddressController extends AbstractController<EmployeeAddressVo> {

    @Autowired
    private EmployeeAddressService service;

    @Override
    protected IService getService() {
        return service;
    }
}

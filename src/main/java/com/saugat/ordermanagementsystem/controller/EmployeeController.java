package com.saugat.ordermanagementsystem.controller;

import com.saugat.ordermanagementsystem.service.EmployeeService;
import com.saugat.ordermanagementsystem.service.IService;
import com.saugat.ordermanagementsystem.wrapper.EmployeeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("employeeController")
@RequestMapping("/employee")
public class EmployeeController extends AbstractController<EmployeeVo> {

    @Autowired
    private EmployeeService service;

    @Override
    protected IService<EmployeeVo> getService() {
        return service;
    }

    @GetMapping("/ping")
    public String pingMe(){
        return "Employee";
    }
}

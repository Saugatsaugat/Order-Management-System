package com.saugat.ordermanagementsystem.controller;

import com.saugat.ordermanagementsystem.service.IService;
import com.saugat.ordermanagementsystem.service.SupplierService;
import com.saugat.ordermanagementsystem.wrapper.SupplierVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/supplierController")
@RequestMapping("/supplier")
public class SupplierController extends AbstractController<SupplierVo> {

    @Autowired
    private SupplierService service;

    @Override
    protected IService<SupplierVo> getService() {
        return service;
    }

    @GetMapping("/ping")
    public String pingMe(){
        return "Supplier";
    }
}

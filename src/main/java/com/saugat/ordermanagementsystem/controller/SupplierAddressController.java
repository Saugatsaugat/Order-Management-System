package com.saugat.ordermanagementsystem.controller;

import com.saugat.ordermanagementsystem.service.IService;
import com.saugat.ordermanagementsystem.service.SupplierAddressService;
import com.saugat.ordermanagementsystem.wrapper.SupplierAddressVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("supplierAddressController")
@RequestMapping("/supplierAddress")
public class SupplierAddressController extends AbstractController<SupplierAddressVo> {

    @Autowired
    private SupplierAddressService service;

    @Override
    protected IService getService() {
        return service;
    }
}

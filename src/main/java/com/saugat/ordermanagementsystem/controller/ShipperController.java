package com.saugat.ordermanagementsystem.controller;

import com.saugat.ordermanagementsystem.service.IService;
import com.saugat.ordermanagementsystem.service.ShipperService;
import com.saugat.ordermanagementsystem.wrapper.ShipperVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("shipperController")
@RequestMapping("/shipper")
public class ShipperController extends AbstractController<ShipperVo> {

    @Autowired
    private ShipperService service;

    @Override
    protected IService<ShipperVo> getService() {
        return service;
    }
}

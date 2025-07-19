package com.saugat.ordermanagementsystem.controller;

import com.saugat.ordermanagementsystem.service.IService;
import com.saugat.ordermanagementsystem.service.InventoryService;
import com.saugat.ordermanagementsystem.wrapper.InventoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("inventoryController")
@RequestMapping("/inventory")
public class InventoryController extends AbstractController<InventoryVo> {

    @Autowired
    private InventoryService service;

    @Override
    protected IService getService() {
        return service;
    }

    @GetMapping("/ping")
    public String pingMe(){
        return "Inventory";
    }
}

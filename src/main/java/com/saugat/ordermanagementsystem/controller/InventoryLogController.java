package com.saugat.ordermanagementsystem.controller;

import com.saugat.ordermanagementsystem.service.IService;
import com.saugat.ordermanagementsystem.service.InventoryLogService;
import com.saugat.ordermanagementsystem.wrapper.InventoryLogVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("inventoryLogController")
@RequestMapping("/inventoryLog")
public class InventoryLogController extends AbstractController<InventoryLogVo> {

    @Autowired
    private InventoryLogService service;

    @Override
    protected IService<InventoryLogVo> getService() {
        return service;
    }
}

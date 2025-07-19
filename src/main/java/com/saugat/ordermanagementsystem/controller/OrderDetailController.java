package com.saugat.ordermanagementsystem.controller;

import com.saugat.ordermanagementsystem.service.IService;
import com.saugat.ordermanagementsystem.service.OrderDetailService;
import com.saugat.ordermanagementsystem.wrapper.OrderDetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("orderDetailController")
@RequestMapping("/orderDetail")
public class OrderDetailController extends AbstractController<OrderDetailVo> {

    @Autowired
    private OrderDetailService service;

    @Override
    protected IService<OrderDetailVo> getService() {
        return service;
    }

    @GetMapping("/ping")
    public String pingMe(){
        return "Order Detail";
    }
}

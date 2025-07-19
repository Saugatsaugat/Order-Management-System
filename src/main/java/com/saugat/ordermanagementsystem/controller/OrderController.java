package com.saugat.ordermanagementsystem.controller;

import com.saugat.ordermanagementsystem.service.IService;
import com.saugat.ordermanagementsystem.service.OrderService;
import com.saugat.ordermanagementsystem.wrapper.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("orderController")
@RequestMapping("/order")
public class OrderController extends AbstractController<OrderVo> {

    @Autowired
    private OrderService service;

    @Override
    protected IService<OrderVo> getService() {
        return service;
    }

    @GetMapping("/ping")
    public String pingMe(){
        return "Order";
    }
}

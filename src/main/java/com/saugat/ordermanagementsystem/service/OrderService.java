package com.saugat.ordermanagementsystem.service;

import com.saugat.ordermanagementsystem.mapper.IBaseMapper;
import com.saugat.ordermanagementsystem.mapper.OrderMapper;
import com.saugat.ordermanagementsystem.model.Order;
import com.saugat.ordermanagementsystem.repo.AbstractRepo;
import com.saugat.ordermanagementsystem.repo.OrderRepo;
import com.saugat.ordermanagementsystem.wrapper.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends AbstractService<Order, OrderVo> {

    @Autowired
    private OrderRepo repo;
    @Autowired
    private OrderMapper mapper;

    @Override
    public String getServiceName() {
        return "Order";
    }

    @Override
    public AbstractRepo<Order> getRepository() {
        return repo;
    }

    @Override
    public IBaseMapper<Order, OrderVo> getMapper() {
        return mapper;
    }
}

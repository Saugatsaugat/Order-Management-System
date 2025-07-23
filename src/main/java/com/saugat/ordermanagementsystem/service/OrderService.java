package com.saugat.ordermanagementsystem.service;

import com.saugat.ordermanagementsystem.mapper.IBaseMapper;
import com.saugat.ordermanagementsystem.mapper.OrderMapper;
import com.saugat.ordermanagementsystem.model.Order;
import com.saugat.ordermanagementsystem.repo.AbstractRepo;
import com.saugat.ordermanagementsystem.repo.OrderRepo;
import com.saugat.ordermanagementsystem.wrapper.OrderVo;
import com.saugat.ordermanagementsystem.wrapper.api.ApiResponse;
import jakarta.transaction.Transactional;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class OrderService extends AbstractService<Order, OrderVo> {

    @Autowired
    private OrderRepo repo;
    @Autowired
    private OrderMapper mapper;
    @Autowired
    private RabbitTemplate rabbitTemplate;

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

    @Override
    public ResponseEntity<ApiResponse<OrderVo>> create(OrderVo vo){
        ResponseEntity<ApiResponse<OrderVo>> response = super.create(vo);
        rabbitTemplate.convertAndSend("soms.topic.exchange","order.created", response.getBody().getResult().getId());
        return response;
    }
}

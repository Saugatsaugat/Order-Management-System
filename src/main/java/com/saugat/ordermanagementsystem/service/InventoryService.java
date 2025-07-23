package com.saugat.ordermanagementsystem.service;

import com.saugat.ordermanagementsystem.mapper.IBaseMapper;
import com.saugat.ordermanagementsystem.mapper.InventoryMapper;
import com.saugat.ordermanagementsystem.model.Inventory;
import com.saugat.ordermanagementsystem.rabbitMQ.RabbitMqConfig;
import com.saugat.ordermanagementsystem.repo.AbstractRepo;
import com.saugat.ordermanagementsystem.repo.InventoryRepo;
import com.saugat.ordermanagementsystem.wrapper.InventoryVo;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InventoryService extends AbstractService<Inventory, InventoryVo> {

    @Autowired
    private InventoryRepo repo;
    @Autowired
    private InventoryMapper mapper;
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public String getServiceName() {
        return "Inventory";
    }

    @Override
    public AbstractRepo<Inventory> getRepository() {
        return repo;
    }

    @Override
    public IBaseMapper<Inventory, InventoryVo> getMapper() {
        return mapper;
    }

    @RabbitListener(queues = RabbitMqConfig.ORDER_CREATED_QUEUE)
    public void handleOrderCreated(Long orderId){
        System.out.println("Inventory Service received order ID: "+ orderId);

        // check inventory logic
        rabbitTemplate.convertAndSend("soms.topic.exchange", "inventory.checked", orderId);

    }
}

package com.saugat.ordermanagementsystem.service;

import com.saugat.ordermanagementsystem.mapper.IBaseMapper;
import com.saugat.ordermanagementsystem.mapper.InventoryMapper;
import com.saugat.ordermanagementsystem.model.Inventory;
import com.saugat.ordermanagementsystem.model.Order;
import com.saugat.ordermanagementsystem.rabbitMQ.RabbitMqConfig;
import com.saugat.ordermanagementsystem.repo.AbstractRepo;
import com.saugat.ordermanagementsystem.repo.InventoryRepo;
import com.saugat.ordermanagementsystem.repo.OrderRepo;
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
    @Autowired
    private OrderRepo orderRepo;

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
        // check inventory is stock is available or not?
        Order order = orderRepo.findById(orderId).get();
        boolean stockAvailable = repo.isStockAvailableByProductId(order.getOrderDetail().getProduct().getId());
        if(stockAvailable){
            System.out.println("Stock available for orderid: "+orderId);
            rabbitTemplate.convertAndSend("soms.topic.exchange", "inventory.checked", orderId);
        }else{
            System.out.println("Out of stock for orderId: "+orderId);
        }
    }
}

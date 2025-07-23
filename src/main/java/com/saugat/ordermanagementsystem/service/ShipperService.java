package com.saugat.ordermanagementsystem.service;

import com.saugat.ordermanagementsystem.mapper.IBaseMapper;
import com.saugat.ordermanagementsystem.mapper.ShipperMapper;
import com.saugat.ordermanagementsystem.model.Shipper;
import com.saugat.ordermanagementsystem.rabbitMQ.RabbitMqConfig;
import com.saugat.ordermanagementsystem.repo.AbstractRepo;
import com.saugat.ordermanagementsystem.repo.ShipperRepo;
import com.saugat.ordermanagementsystem.wrapper.ShipperVo;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ShipperService extends AbstractService<Shipper, ShipperVo> {

    @Autowired
    private ShipperRepo repo;
    @Autowired
    private ShipperMapper mapper;
    @Autowired
    private RabbitTemplate rabbitTemplate;


    @Override
    public String getServiceName() {
        return "Shipper";
    }

    @Override
    public AbstractRepo<Shipper> getRepository() {
        return repo;
    }

    @Override
    public IBaseMapper<Shipper, ShipperVo> getMapper() {
        return mapper;
    }


    @RabbitListener(queues = RabbitMqConfig.INVENTORY_CHECKED_QUEUE)
    public void handleInventoryChecked(Long orderId){
        System.out.println("Shipping Service assigning shipper for Order ID: "+orderId);

        // logic to assign shipper


        // TO DO
        // Send notification
        rabbitTemplate.convertAndSend("soms.topic.exchange", "shipper.assigned", orderId);

    }
}

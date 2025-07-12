package com.saugat.ordermanagementsystem.rabbitMQ;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @RabbitListener(queues = {"Queue-1"})
    public void consumeMessage(String message) {
        System.out.println("Received: " + message);
    }
}

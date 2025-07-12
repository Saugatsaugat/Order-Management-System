package com.saugat.ordermanagementsystem.rabbitMQ;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Publisher {

    @Autowired
    private RabbitTemplate template;

    public Publisher(RabbitTemplate template){
        this.template = template;
    }
    public void generateMessage() {
        String message = "Howdy";
        template.convertAndSend("Queue-1", message);
        System.out.println("Message Sent");
    }

}

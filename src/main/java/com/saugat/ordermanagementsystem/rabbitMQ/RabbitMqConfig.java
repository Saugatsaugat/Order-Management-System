package com.saugat.ordermanagementsystem.rabbitMQ;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    // Exchange
    public static final String EXCHANGE_NAME = "soms.topic.exchange";

    //Queue
    public static final String ORDER_CREATED_QUEUE = "order.created.queue";
    public static final String INVENTORY_CHECKED_QUEUE = "inventory.checked.queue";
    public static final String SHIPPER_ASSIGNED_QUEUE = "shipper.assigned.queue";

    // Routing Keys
    public static final String ORDER_CREATED_KEY = "order.created";
    public static final String INVENTORY_CHECKED_KEY = "inventory.checked";
    public static final String SHIPPER_ASSIGNED_KEY = "shipper.assigned";

    // Define Topic Exchange
    @Bean
    public TopicExchange topicExchange(){
        return new TopicExchange(EXCHANGE_NAME);
    }

    // Define Queues
    @Bean
    public Queue orderCreatedQueue(){
        return new Queue(ORDER_CREATED_QUEUE, true);
    }

    @Bean
    public Queue inventoryCheckedQueue(){
        return new Queue(INVENTORY_CHECKED_QUEUE, true);
    }

    @Bean
    public Queue shipperAssignedQueue(){
        return new Queue(SHIPPER_ASSIGNED_QUEUE, true);
    }


    // Bind Queues
    @Bean
    public Binding bindOrderCreated(){
        return BindingBuilder
                .bind(orderCreatedQueue())
                .to(topicExchange())
                .with(ORDER_CREATED_KEY);
    }
    @Bean
    public Binding bindInventoryCheck(){
        return BindingBuilder
                .bind(inventoryCheckedQueue())
                .to(topicExchange())
                .with(INVENTORY_CHECKED_KEY);
    }

    @Bean
    public Binding bindShippingAssigned(){
        return BindingBuilder
                .bind(shipperAssignedQueue())
                .to(topicExchange())
                .with(SHIPPER_ASSIGNED_KEY);
    }

}

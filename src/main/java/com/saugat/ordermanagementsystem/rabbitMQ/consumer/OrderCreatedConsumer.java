package com.saugat.ordermanagementsystem.rabbitMQ.consumer;

import com.saugat.ordermanagementsystem.rabbitMQ.RabbitMqConfig;
import com.saugat.ordermanagementsystem.service.mail.EmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OrderCreatedConsumer {

    private static final Logger log = LoggerFactory.getLogger(OrderCreatedConsumer.class);

    @Value("${MAIL_USERNAME}")
    private String mailUsername;

    @Autowired
    private EmailService emailService;

    @RabbitListener(queues = {RabbitMqConfig.ORDER_CREATED_QUEUE})
    public void consumeMessage(String message) {

        log.info("Received message from order.created.queue: {}", message);
        log.info("Sending email to the customer about order creation...");

        try {
            // Send email to the customer
            String subject = "Order Created Successfully";
            String body = "Dear Customer,\n\nYour order has been created successfully. Order details: " + message + "\n\nThank you for shopping with us!";
            emailService.sendEmail(mailUsername, subject, body);
        } catch (Exception e) {
            log.error("Error occurred while sending email", e);
        }

    }
}

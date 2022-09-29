package com.example.testkafka.even;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Notification {

    private static final Logger logger = LogManager.getFormatterLogger(Notification.class);
    private static String TOPIC = "kafka";
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public void publishPaymentSuccess(String email, String message) {
        String compare = email +","+ message;
        logger.info("Produce Topic: %s - Email: %s - Message: %s", TOPIC,email,message);
        this.kafkaTemplate.send(TOPIC,compare);
    }
}

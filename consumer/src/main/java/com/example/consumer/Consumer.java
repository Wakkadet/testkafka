package com.example.consumer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer {
    private static final Logger logger = LogManager.getFormatterLogger(Consumer.class);

    @KafkaListener(topics = "kafka", groupId = "myGroup")
    public void consume(String notification) {
        logger.info(" Consume[kafka] || Received Notification: { %s }", notification);
    }

    @KafkaListener(topics = "gefd34",groupId = "myGroup")
    public void consume23(String notification) {
        logger.info(" Consume[gefd34] || Received Notification: { %s }", notification);
    }
}

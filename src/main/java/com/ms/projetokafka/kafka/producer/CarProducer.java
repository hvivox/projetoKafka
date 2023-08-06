package com.ms.projetokafka.kafka.producer;


import com.ms.projetokafka.kafka.controller.CarDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class CarProducer {

    private static final Logger logger = LoggerFactory.getLogger(CarProducer.class);
    private final String topic;
    private final KafkaTemplate<String, CarDTO> kafkaTemplate;

    public CarProducer(@Value("${topic.name}") String topic, KafkaTemplate<String, CarDTO> kafkaTemplate) {
        this.topic = topic;
        this.kafkaTemplate = kafkaTemplate;
    }
    
    public void send(CarDTO carDTO) {
        CompletableFuture<SendResult<String, CarDTO>> future = kafkaTemplate.send(topic, carDTO);
        future.whenComplete((result, ex) -> {
            if (ex != null) {
                logger.info("Message failure" + ex.getMessage());
            } else {
                logger.info("Messagem send" + result.getProducerRecord().value());
            }
        });
    }
    
}

package com.przemyslawsk.kafka_learning;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "przemyslawsk", groupId = "groupId")
    void listener(String data) {
        System.out.println("Listener received message: " + data);
    }
}

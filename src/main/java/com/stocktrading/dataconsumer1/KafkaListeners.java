package com.stocktrading.dataconsumer1;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "stockInfo",
            groupId = "foo"
    )
    void listener(String data) {
        System.out.println("Listener received following data: " + data);
    }
}

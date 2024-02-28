package com.stocktrading.dataconsumer1;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import static com.stocktrading.dataconsumer1.EventTopic.STOCK_INFO;

@Component
@Log4j2
public class KafkaListeners {

    @KafkaListener(
            topics = "STOCK_INFO",
            groupId = "foo"
    )
    void listener(String data) {
        System.out.println("Listener received following data " + data);
        log.info("Listener received following data: {}", data);
    }
}

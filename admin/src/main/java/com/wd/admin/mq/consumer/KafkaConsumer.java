package com.wd.admin.mq.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    @KafkaListener(topics = "my_topic")
    public void receiveMessage(ConsumerRecord<String, String> record) {
        System.out.println(record.value());
    }
}

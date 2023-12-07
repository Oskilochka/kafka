package com.josk.kafka.consumer;

import com.josk.kafka.payload.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumer {

//    @KafkaListener(topics = "test", groupId = "myGroup")
    public void consumeMessage(String message) {
        log.info(String.format("Consuming a message from test Topic:: %s", message));
    }

    @KafkaListener(topics = "test", groupId = "myGroup")
    public void consumeUserJsonMessage(User user) {
        log.info(String.format("Consuming a message from test Topic:: %s", user.toString()));
    }
}

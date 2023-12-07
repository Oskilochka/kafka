package com.josk.kafka.producer;

import com.josk.kafka.payload.User;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaUserJsonProducer {

    private final KafkaTemplate<String, User> kafkaTemplate;

    public void sendMessage(User user) {
        Message<User> message = MessageBuilder
                .withPayload(user)
                .setHeader(KafkaHeaders.TOPIC, "test")
                .build();

        kafkaTemplate.send(message);
    }
}

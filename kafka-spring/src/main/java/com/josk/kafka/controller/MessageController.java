package com.josk.kafka.controller;

import com.josk.kafka.payload.User;
import com.josk.kafka.producer.KafkaProducer;
import com.josk.kafka.producer.KafkaUserJsonProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/messages")
@RequiredArgsConstructor
public class MessageController {
    private final KafkaProducer kafkaProducer;
    private final KafkaUserJsonProducer kafkaUserJsonProducer;

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody String message) {
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message queued successfully");
    }

    @PostMapping("/user-json")
    public ResponseEntity<String> sendUserJsonMessage(@RequestBody User user) {
        kafkaUserJsonProducer.sendMessage(user);
        return ResponseEntity.ok("Message user as json queued successfully");
    }
}

package com.example.task9;

import java.time.LocalDateTime;
import java.util.concurrent.CountDownLatch;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    private RabbitTemplate rabbitTemplate;

    public Receiver(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(Auth auth) {
        System.out.println(auth.getName());
        rabbitTemplate.convertAndSend(SimpleConfiguration.topicExchangeName, SimpleConfiguration.auth, new ValidAuth(auth.getId(), "VALID", LocalDateTime.now(), "Ничего нам не должен"));
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }

}

package com.springboot.kafkaeaxmple.kafkastreamexample.consumer;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
@RequiredArgsConstructor
public class KafkaDataConsumer {
    @Bean
    public Consumer<String> sampleKakfaConsumerChannel(){
        return this::listen;
    }

    private void listen(String message) {
        System.out.println("Kafka message consumed :-" + message);
    }
}

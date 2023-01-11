package com.springboot.kafkaeaxmple.kafkastreamexample.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

@Configuration
@RequiredArgsConstructor
public class KafkaDataProducer {
    @Bean
    public Supplier<Flux<String>> sampleKafkaProducerChannel() {
        return () -> Flux.fromStream(Stream.generate(new Supplier<String>() {
            @Override
            public String get() {
                try {
                    Thread.sleep(1000);
                    return "Hello from Supplier 2";
                } catch (Exception e) {
                    // ignore
                }
                return null;
            }
        })).subscribeOn(Schedulers.elastic()).share();
    }
}

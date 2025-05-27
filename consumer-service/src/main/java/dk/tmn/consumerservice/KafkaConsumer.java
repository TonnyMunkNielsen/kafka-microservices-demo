package dk.tmn.consumerservice;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class KafkaConsumer {

    @KafkaListener(topics = "demo-topic", groupId = "my-consumer-group")
    public void consume(String message) {
        log.info("Consumed message: {}", message);
    }
}

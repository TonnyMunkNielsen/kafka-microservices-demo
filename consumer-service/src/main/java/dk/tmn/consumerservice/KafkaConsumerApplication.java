package dk.tmn.consumerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class KafkaConsumerApplication {
	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerApplication.class, args);
	}
}

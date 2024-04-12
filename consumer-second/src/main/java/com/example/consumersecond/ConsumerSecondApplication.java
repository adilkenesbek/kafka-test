package com.example.consumersecond;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class ConsumerSecondApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerSecondApplication.class, args);
    }

}

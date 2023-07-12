package com.example.cliente_micro_contactos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.Executor;


@SpringBootApplication
@EnableAsync(proxyTargetClass = true)
public class ClienteMicroContactosApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClienteMicroContactosApplication.class, args);
    }


    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public Executor executor() {
        return new ThreadPoolTaskExecutor();
    }
}

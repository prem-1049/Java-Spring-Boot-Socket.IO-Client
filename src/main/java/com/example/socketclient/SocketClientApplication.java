package com.example.socketclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SocketClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SocketClientApplication.class, args);
    }

    @Bean
    public MyCustomBean myCustomBean() {
        return new MyCustomBean();
    }
}
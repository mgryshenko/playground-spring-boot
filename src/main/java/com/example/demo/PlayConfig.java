package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlayConfig {

    @Bean
    public String playMessage() {
        return "Hello playground!";
    }
}

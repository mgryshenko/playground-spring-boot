package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PlayConfigTest {

    @Autowired
    private String playMessage;

    @Test
    void playMessage_beanIsCreated() {
        assertThat(playMessage).isNotBlank();
    }
}
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class PlayBean {

    private final String playMessage;

    @Autowired
    public PlayBean(String playMessage) {
        this.playMessage = playMessage;
    }

    @PostConstruct
    public void init() {
        System.out.println("PlayBean: init()");
        playMessage();
    }

    public void playMessage() {
        System.out.println("PlayBean: " + playMessage);
    }
}

package com.example.stream8803.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

//@RestController
@EnableBinding(Sink.class)
@Component
public class c {
    @Value("${server.port}")
    private String string;
    @StreamListener(Sink.INPUT)
    public void aVoid(Message<String> message){
        System.out.println("消费者"+message.getPayload()+"/t"+string);
    }
}

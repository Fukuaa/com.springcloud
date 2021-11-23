package com.example.streamrabbitmq.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;
//@Service
@EnableBinding(Source.class)
public class messageimpl implements message{
    @Resource
    private MessageChannel output;
    @Override
    public String send() {
        String s = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(s).build());
        System.out.println("s"+s);
        return null;
    }
}

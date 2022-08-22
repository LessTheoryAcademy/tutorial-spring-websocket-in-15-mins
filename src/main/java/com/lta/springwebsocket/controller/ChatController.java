package com.lta.springwebsocket.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.lta.springwebsocket.ChatMessage;
import com.lta.springwebsocket.MessageToSend;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class ChatController {

    @MessageMapping("/chat")
    @SendTo("/topic/chat")
    public MessageToSend send(ChatMessage message) throws Exception {

        MessageToSend outMessage = new MessageToSend();
        outMessage.setSender(message.getSender());
        outMessage.setText(message.getText());
        outMessage.setTime(new SimpleDateFormat("HH:mm dd-MM-yyyy").format(new Date()));
        
        return outMessage;
    }
}
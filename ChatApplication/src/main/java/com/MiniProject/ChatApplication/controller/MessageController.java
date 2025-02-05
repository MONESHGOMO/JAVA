package com.MiniProject.ChatApplication.controller;

import com.MiniProject.ChatApplication.models.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {

//    @MessageMapping("/sendMessage")  // mapped as /app/sendMessage
//    @SendTo("/topic/message")  // public notification
//    public ChatMessage sendMessage(@Payload ChatMessage chatMessage) {
//        return chatMessage;
//    }
    @MessageMapping("/sendMessage")
    @SendTo("/topic/message")
    public ChatMessage sendMessage(@Payload ChatMessage chatMessage) {
        System.out.println("Received message from: " + chatMessage.getSender());
        return chatMessage;
    }


    @GetMapping("/chat")
    public String chat(){
        return "chat";
   }
}
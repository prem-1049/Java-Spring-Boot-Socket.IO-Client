package com.example.socketclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    private List<String> messages = new ArrayList<>();

    @GetMapping
    public List<String> getMessages() {
        return messages;
    }

    // Add a method to store messages (call this from SocketClient)
    public void addMessage(String message) {
        messages.add(message);
    }
}
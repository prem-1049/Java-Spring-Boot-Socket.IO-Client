package com.example.socketclient;

import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;


@Service
public class SocketClient {
    private final MessageController messageController;

    public SocketClient(MessageController messageController) {
        this.messageController = messageController;
    }


    @PostConstruct
    public void init() {
        try {
            // Connect to the Socket.IO server
            Socket socket = IO.socket("http://localhost:3000");

            // Listen for 'message' events
            socket.on("message", new Emitter.Listener() {
                @Override
                public void call(Object... args) {
                    String message = (String) args[0];
                    System.out.println("Received message: " + message);
                    messageController.addMessage(message);
                }
            });

            // Connect to the server
            socket.connect();

            // Log connection status
            socket.on(Socket.EVENT_CONNECT, args -> System.out.println("Connected to server"));
            socket.on(Socket.EVENT_DISCONNECT, args -> System.out.println("Disconnected from server"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
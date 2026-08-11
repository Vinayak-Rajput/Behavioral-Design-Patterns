package com.example.behavior.Mediator;

public class ChatUser extends User {

    public ChatUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " sends " + message);
        mediator.sendMessage(message,this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " receives " + message);
    }
}

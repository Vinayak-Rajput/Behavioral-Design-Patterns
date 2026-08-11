package com.example.behavior.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoomImpl implements ChatMediator{
    private List<User> users;

    public ChatRoomImpl(){
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for(User user1 : this.users){
            if(user1 != user){
                user1.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}

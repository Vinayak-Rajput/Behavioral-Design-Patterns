package com.example.behavior.Mediator;

public class MediatorPlatformDemo {
    static void main() {
        ChatMediator chatRoom = new ChatRoomImpl();

        User user1 = new ChatUser(chatRoom,"Alice");
        User user2 = new ChatUser(chatRoom,"Bob");
        User user3 = new ChatUser(chatRoom,"Charles");
        User user4 = new ChatUser(chatRoom,"Eddy");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);
        chatRoom.addUser(user4);

        System.out.println("----Chat Started----");
        user1.send("Hi, everyone");
        user3.send("Hi, Alice");
        user1.send("Hello, Charles");
        user4.send("Hey, Its such a jolly day y,all ");
    }
}

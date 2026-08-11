package com.example.behavior.State;

public class StateDemo {
    static void main() {
        AudioPlayer player = new AudioPlayer();

        System.out.println("---click Play---");

        player.clickLock();
        player.clickPlay();
        player.clickPlay();
        player.clickLock();
        player.clickPlay();
    }
}

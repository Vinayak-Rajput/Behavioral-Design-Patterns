package com.example.behavior.State;

public class LockedState implements State{
    @Override
    public void clickPlay(AudioPlayer player) {
        System.out.println("Locked: Unlocking required to play");
    }

    @Override
    public void clickLock(AudioPlayer player) {
        System.out.println("Unlocking the player...");
        player.changeState(new ReadyState());
    }
}

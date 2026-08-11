package com.example.behavior.State;

public class ReadyState implements State{
    @Override
    public void clickPlay(AudioPlayer player) {
        System.out.println("Starting Playback...");
        player.changeState(new PlayingState());
    }

    @Override
    public void clickLock(AudioPlayer player) {
        System.out.println("Locking Player...");
        player.changeState(new LockedState());
    }
}

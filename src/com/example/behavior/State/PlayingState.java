package com.example.behavior.State;

public class PlayingState implements State{
    @Override
    public void clickPlay(AudioPlayer player) {
        System.out.println("Pausing Playback...");
        player.changeState(new ReadyState());
    }

    @Override
    public void clickLock(AudioPlayer player) {
        System.out.println("Locking while Playing...");
        player.changeState(new LockedState());
    }
}

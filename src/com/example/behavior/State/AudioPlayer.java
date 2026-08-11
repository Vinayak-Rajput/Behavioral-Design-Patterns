package com.example.behavior.State;

public class AudioPlayer {

    private State state;

    public AudioPlayer(){
        this.state = new ReadyState();
    }

    public void changeState(State state){
        this.state = state;
    }

    public void clickPlay(){
        state.clickPlay(this);
    }

    public void clickLock(){
        state.clickLock(this);
    }
}

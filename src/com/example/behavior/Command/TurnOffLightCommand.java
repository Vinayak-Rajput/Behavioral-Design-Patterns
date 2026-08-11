package com.example.behavior.Command;

public class TurnOffLightCommand implements Command {
    private SmartLight light;

    public TurnOffLightCommand(SmartLight light){
        this.light = light;
    }

    @Override
    public void execute(){
        light.turnOff();
    }

    @Override
    public void undo(){
        light.turnOn();
    }
}

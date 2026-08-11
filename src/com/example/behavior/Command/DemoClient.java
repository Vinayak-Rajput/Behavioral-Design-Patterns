package com.example.behavior.Command;

public class DemoClient {
    static void main() {
        SmartLight livingRoomLight = new SmartLight();
        Command turnOn = new TurnOnLightCommand(livingRoomLight);
        Command turnOff = new TurnOffLightCommand(livingRoomLight);

        RemoteControl remote  = new RemoteControl();
        remote.setCommand(turnOn);
        remote.pressButton();

        remote.setCommand(turnOff);
        remote.pressButton();

        System.out.println("Undoing the commands...");

        remote.pressUndo();
        remote.pressUndo();
    }
}

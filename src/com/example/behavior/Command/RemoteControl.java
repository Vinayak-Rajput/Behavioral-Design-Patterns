package com.example.behavior.Command;

import java.util.Stack;

public class RemoteControl {
    private Command buttonCommand;

    private Stack<Command> commandHistory = new Stack<>();

    public void setCommand(Command command){
        this.buttonCommand =command;
    }

    public void pressButton(){
        System.out.println("Press Button");
        buttonCommand.execute();
        commandHistory.push(buttonCommand);
    }

    public void pressUndo(){
        if(!commandHistory.isEmpty()){
            System.out.println("Pressing Undo");
            Command lastCommand = commandHistory.pop();
        }else{
            System.out.println("Nothing to Undo");
        }
    }

}

package com.example.behavior.Memento;

import java.util.Stack;

public class History {
    private final Stack<EditorMemento> historyStack = new Stack<>();

    public void save(TextEditor editor){
        historyStack.push(editor.createMemento());
    }

    public void undo(TextEditor editor){

        if(!historyStack.isEmpty()){

            editor.restore(historyStack.pop());
        }else{

            System.out.println("Nothing Undo");
        }
    }
}

package com.example.behavior.Memento;

public class MementoDemo {

    static void main() {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.type("Hello");
        history.save(editor);

        editor.type(" World!");
        history.save(editor);

        editor.type("This text will be undone ");
        System.out.println("Current Text "+ editor.getContent());

        editor.type("Performing Undo 1");
        history.undo(editor);

        System.out.println("Current Text "+ editor.getContent());
    }
}

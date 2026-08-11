package com.example.behavior.Memento;

public class TextEditor {
    private String content ="";

    public void type(String text){
        this.content = text;
    }

    public String getContent(){
        return content;
    }

    public EditorMemento createMemento(){
        return new EditorMemento(content);
    }

    public void restore(EditorMemento memento){
        if(memento != null){
            this.content = memento.getContent();
        }
    }
}

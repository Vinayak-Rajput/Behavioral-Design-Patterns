package com.example.behavior.Template;

public abstract class DataMiner {
    public final void mineData(String path){
        openFile(path);
        extractData();
        parseData();
        analyzeData();
        sendReport();
        closeFile();
    }

    private void openFile(String path){
        System.out.println("Opeining file at "+ path);
    }

    private void analyzeData(){
        System.out.println("Analyzing Parsed Data");
    }

    private void sendReport(){
        System.out.println("Sending Report");
    }

    private void closeFile(){
        System.out.println("Closing File");
    }

    abstract void extractData();
    abstract void parseData();
}

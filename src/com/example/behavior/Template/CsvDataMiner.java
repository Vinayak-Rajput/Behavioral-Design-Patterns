package com.example.behavior.Template;

public class CsvDataMiner extends DataMiner{
    @Override
    void extractData() {
        System.out.println("Reading csv from file");
    }

    @Override
    void parseData() {
        System.out.println("Parsing text into tabular data grids");
    }
}

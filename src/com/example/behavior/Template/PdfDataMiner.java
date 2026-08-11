package com.example.behavior.Template;

public class PdfDataMiner extends DataMiner{
    @Override
    void extractData() {
        System.out.println("Extracting raw text stream from PDF");
    }

    @Override
    void parseData() {
        System.out.println("Parsing text into Document structure");
    }
}

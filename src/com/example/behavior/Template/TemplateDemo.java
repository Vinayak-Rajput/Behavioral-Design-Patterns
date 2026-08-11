package com.example.behavior.Template;

public class TemplateDemo {
    static void main() {
        DataMiner pdfMiner = new PdfDataMiner();
        System.out.println("Processing PDF file");
        pdfMiner.mineData("/docs/annual_budget.pdf");
    }
}


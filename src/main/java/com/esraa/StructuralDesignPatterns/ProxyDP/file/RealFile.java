package com.esraa.StructuralDesignPatterns.ProxyDP.file;

public class RealFile extends File {

    RealFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void openFile() {
        System.out.println("Opening file: " + fileName);
    }
}

package com.esraa.StructuralDesignPatterns.ProxyDP;

import com.esraa.StructuralDesignPatterns.ProxyDP.file.File;
import com.esraa.StructuralDesignPatterns.ProxyDP.file.ProxyFile;

public class Client {
    public static void main(String[] args) {
        File file = new ProxyFile("image.png","admin");
        file.openFile();

        System.out.println("######");

        File file2 = new ProxyFile("image2.png","user");
        file2.openFile();
    }
}

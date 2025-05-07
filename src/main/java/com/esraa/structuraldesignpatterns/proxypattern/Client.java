package com.esraa.structuraldesignpatterns.proxypattern;

import com.esraa.structuraldesignpatterns.proxypattern.file.File;
import com.esraa.structuraldesignpatterns.proxypattern.file.ProxyFile;

public class Client {
    public static void main(String[] args) {
        File file = new ProxyFile("image.png","admin");
        file.openFile();

        System.out.println("######");

        File file2 = new ProxyFile("image2.png","user");
        file2.openFile();
    }
}

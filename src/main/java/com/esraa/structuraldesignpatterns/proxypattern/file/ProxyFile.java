package com.esraa.structuraldesignpatterns.proxypattern.file;

public class ProxyFile extends File {
    private RealFile realFile;
    String role;

    public ProxyFile(String fileName, String role) {
        this.realFile = new RealFile(fileName);
        this.role = role;
    }

    @Override
    public void openFile() {

        if(role.equals("admin")) {
            realFile.openFile();
        }
        else {
                System.out.println("Access denied: You don't have permission to open this file.");
        }
    }
}

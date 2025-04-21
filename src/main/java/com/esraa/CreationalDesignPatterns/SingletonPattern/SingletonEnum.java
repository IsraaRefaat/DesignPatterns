package com.esraa.CreationalDesignPatterns.SingletonPattern;

public enum SingletonEnum {
    INSTANCE;

    public synchronized void getInstance()
    {
        System.out.println("Singleton Instance already exists");
    }
}

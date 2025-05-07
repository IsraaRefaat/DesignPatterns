package com.esraa.creationaldesignpatterns.singletonpattern.differentapproachsforImplementsigleton;

public enum SingletonEnum {
    INSTANCE;

    public synchronized void getInstance()
    {
        System.out.println("Singleton Instance already exists");
    }
}

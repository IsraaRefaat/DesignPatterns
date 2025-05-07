package com.esraa.creationaldesignpatterns.singletonpattern.differentapproachsforImplementsigleton;

public final class SingletonPatternEarlyInit {

    //Early Initialization -> thread-safe without synchronized word
    private static SingletonPatternEarlyInit instance = new SingletonPatternEarlyInit();

    private SingletonPatternEarlyInit() {}

    public static SingletonPatternEarlyInit getInstance() {
        System.out.println("Singleton Instance already exists");
        return instance;
    }
}

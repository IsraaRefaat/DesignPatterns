package com.esraa.CreationalDesignPatterns;

// It ensures that a class has only one instance and provides a global point of access to it.
// it's final, so no class can extend it
public final class SingletonPattern {

    private static SingletonPattern instance;

    //it's private, so the client cannot make an instance of it.
    private SingletonPattern() {}

    public static SingletonPattern getInstance() {
        if(instance == null) {
            instance = new SingletonPattern();
            System.out.println("Singleton Instance created");
            return instance;
        }
        System.out.println("Singleton Instance already exists");
        return instance;
    }

}

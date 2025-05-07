package com.esraa.creationaldesignpatterns.singletonpattern.differentapproachsforImplementsigleton;

// It ensures that a class has only one instance and provides a global point of access to it.
// It's final, so no class can extend it.
public final class SingletonPatternLazyInit {

    //Lazy Initialization
    private static SingletonPatternLazyInit instance;


    //it's private, so the client cannot make an instance of it.
    private SingletonPatternLazyInit() {}

    //We use synchronized keyword to prevent the race condition
    public static synchronized SingletonPatternLazyInit getInstance() {
        if(instance == null) {
            instance = new SingletonPatternLazyInit();
            System.out.println("Singleton Instance created");
            return instance;
        }
        System.out.println("Singleton Instance already exists");
        return instance;
    }

}

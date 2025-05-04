package com.esraa.CreationalDesignPatterns.FactoryMethodPattern;


import com.esraa.CreationalDesignPatterns.FactoryMethodPattern.animal.Animal;
import com.esraa.CreationalDesignPatterns.FactoryMethodPattern.factory.AnimalFactory;
import com.esraa.CreationalDesignPatterns.FactoryMethodPattern.factory.DogFactory;

public class Client {
    public static void main(String[] args) {
        AnimalFactory factory = new DogFactory();
        Animal dog = factory.createAnimal("red");
        dog.displayBehavior();
    }
}

package com.esraa.CreationalDesignPatterns.FactoryMethodPattern;


import com.esraa.CreationalDesignPatterns.FactoryMethodPattern.Animal.Animal;
import com.esraa.CreationalDesignPatterns.FactoryMethodPattern.Factory.AnimalFactory;
import com.esraa.CreationalDesignPatterns.FactoryMethodPattern.Factory.DogFactory;

public class Client {
    public static void main(String[] args) {
        AnimalFactory factory = new DogFactory();
        Animal dog = factory.createAnimal("red");
        dog.displayBehavior();
    }
}

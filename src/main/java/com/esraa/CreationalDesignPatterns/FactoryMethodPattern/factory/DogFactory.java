package com.esraa.CreationalDesignPatterns.FactoryMethodPattern.factory;

import com.esraa.CreationalDesignPatterns.FactoryMethodPattern.animal.Animal;
import com.esraa.CreationalDesignPatterns.FactoryMethodPattern.animal.Dog;

public class DogFactory extends AnimalFactory {


    @Override
    public Animal createAnimal(String color) {
        return new Dog(color);
    }
}

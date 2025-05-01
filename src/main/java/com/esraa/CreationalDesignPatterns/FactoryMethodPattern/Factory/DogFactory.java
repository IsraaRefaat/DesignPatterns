package com.esraa.CreationalDesignPatterns.FactoryMethodPattern.Factory;

import com.esraa.CreationalDesignPatterns.FactoryMethodPattern.Animal.Animal;
import com.esraa.CreationalDesignPatterns.FactoryMethodPattern.Animal.Dog;

public class DogFactory extends AnimalFactory {


    @Override
    public Animal createAnimal(String color) {
        return new Dog(color);
    }
}

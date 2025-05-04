package com.esraa.CreationalDesignPatterns.FactoryMethodPattern.factory;

import com.esraa.CreationalDesignPatterns.FactoryMethodPattern.animal.Animal;

public abstract class AnimalFactory {
    public abstract Animal createAnimal(String color);
}

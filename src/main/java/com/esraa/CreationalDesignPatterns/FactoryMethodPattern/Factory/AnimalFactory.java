package com.esraa.CreationalDesignPatterns.FactoryMethodPattern.Factory;

import com.esraa.CreationalDesignPatterns.FactoryMethodPattern.Animal.Animal;

public abstract class AnimalFactory {
    public abstract Animal createAnimal(String color);
}

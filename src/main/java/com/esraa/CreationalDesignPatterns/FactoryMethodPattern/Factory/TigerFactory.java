package com.esraa.CreationalDesignPatterns.FactoryMethodPattern.Factory;

import com.esraa.CreationalDesignPatterns.FactoryMethodPattern.Animal.Animal;
import com.esraa.CreationalDesignPatterns.FactoryMethodPattern.Animal.Tiger;

public class TigerFactory extends AnimalFactory {
    @Override
    public Animal createAnimal(String color) {
        return new Tiger(color);
    }
}

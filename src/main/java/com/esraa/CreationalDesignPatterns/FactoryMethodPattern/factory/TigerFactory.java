package com.esraa.CreationalDesignPatterns.FactoryMethodPattern.factory;

import com.esraa.CreationalDesignPatterns.FactoryMethodPattern.animal.Animal;
import com.esraa.CreationalDesignPatterns.FactoryMethodPattern.animal.Tiger;

public class TigerFactory extends AnimalFactory {
    @Override
    public Animal createAnimal(String color) {
        return new Tiger(color);
    }
}

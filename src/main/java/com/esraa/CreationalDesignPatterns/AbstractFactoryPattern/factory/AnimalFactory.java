package com.esraa.CreationalDesignPatterns.AbstractFactoryPattern.factory;

import com.esraa.CreationalDesignPatterns.AbstractFactoryPattern.animal.Dog;
import com.esraa.CreationalDesignPatterns.AbstractFactoryPattern.animal.Tiger;

public abstract class AnimalFactory {

    public abstract Dog createDog(String color);

    public abstract Tiger createTiger(String color);

}

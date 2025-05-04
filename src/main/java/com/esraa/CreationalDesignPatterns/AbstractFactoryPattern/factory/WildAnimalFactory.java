package com.esraa.CreationalDesignPatterns.AbstractFactoryPattern.factory;

import com.esraa.CreationalDesignPatterns.AbstractFactoryPattern.animal.Dog;
import com.esraa.CreationalDesignPatterns.AbstractFactoryPattern.animal.Tiger;
import com.esraa.CreationalDesignPatterns.AbstractFactoryPattern.animal.WildDog;
import com.esraa.CreationalDesignPatterns.AbstractFactoryPattern.animal.WildTiger;

public class WildAnimalFactory extends AnimalFactory {

    public WildAnimalFactory() {
        System.out.println("Wild Animal Factory");
    }

    public Dog createDog(String color){
        return new WildDog(color);
    }

    public Tiger createTiger(String color){
        return new WildTiger(color);
    }

}

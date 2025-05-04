package com.esraa.CreationalDesignPatterns.AbstractFactoryPattern.factory;

import com.esraa.CreationalDesignPatterns.AbstractFactoryPattern.animal.Dog;
import com.esraa.CreationalDesignPatterns.AbstractFactoryPattern.animal.PetDog;
import com.esraa.CreationalDesignPatterns.AbstractFactoryPattern.animal.PetTiger;
import com.esraa.CreationalDesignPatterns.AbstractFactoryPattern.animal.Tiger;


public class PetAnimalFactory extends AnimalFactory {

    public PetAnimalFactory() {
        System.out.println("Pet Animal Factory");
    }

   public Dog createDog(String color){
       return new PetDog(color);
    }

    public Tiger createTiger(String color){
       return new PetTiger(color);
    }
}

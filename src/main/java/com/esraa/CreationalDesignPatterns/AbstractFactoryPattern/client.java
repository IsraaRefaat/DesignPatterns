package com.esraa.CreationalDesignPatterns.AbstractFactoryPattern;

import com.esraa.CreationalDesignPatterns.AbstractFactoryPattern.animal.Dog;
import com.esraa.CreationalDesignPatterns.AbstractFactoryPattern.animal.Tiger;
import com.esraa.CreationalDesignPatterns.AbstractFactoryPattern.factory.AnimalFactory;
import com.esraa.CreationalDesignPatterns.AbstractFactoryPattern.factory.PetAnimalFactory;
import com.esraa.CreationalDesignPatterns.AbstractFactoryPattern.factory.WildAnimalFactory;
import com.esraa.CreationalDesignPatterns.FactoryMethodPattern.factory.DogFactory;

public class client {
    public static void main(String[] args) {

        AnimalFactory petFactory = new PetAnimalFactory();
        Dog petDog = petFactory.createDog("White");
        Tiger petTiger = petFactory.createTiger("Black");

        System.out.println("#######");

        AnimalFactory wildFactory = new WildAnimalFactory();
        Dog wildDog = wildFactory.createDog("White");
        Tiger wildTiger = wildFactory.createTiger("Black");

    }
}

package com.esraa.creationaldesignpatterns.abstractfactorypattern;

import com.esraa.creationaldesignpatterns.abstractfactorypattern.animal.Dog;
import com.esraa.creationaldesignpatterns.abstractfactorypattern.animal.Tiger;
import com.esraa.creationaldesignpatterns.abstractfactorypattern.factory.AnimalFactory;
import com.esraa.creationaldesignpatterns.abstractfactorypattern.factory.PetAnimalFactory;
import com.esraa.creationaldesignpatterns.abstractfactorypattern.factory.WildAnimalFactory;

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

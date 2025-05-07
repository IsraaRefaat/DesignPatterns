package com.esraa.creationaldesignpatterns.abstractfactorypattern.factory;

import com.esraa.creationaldesignpatterns.abstractfactorypattern.animal.Dog;
import com.esraa.creationaldesignpatterns.abstractfactorypattern.animal.PetDog;
import com.esraa.creationaldesignpatterns.abstractfactorypattern.animal.PetTiger;
import com.esraa.creationaldesignpatterns.abstractfactorypattern.animal.Tiger;


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

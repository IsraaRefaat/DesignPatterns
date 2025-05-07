package com.esraa.creationaldesignpatterns.abstractfactorypattern.factory;

import com.esraa.creationaldesignpatterns.abstractfactorypattern.animal.Dog;
import com.esraa.creationaldesignpatterns.abstractfactorypattern.animal.Tiger;
import com.esraa.creationaldesignpatterns.abstractfactorypattern.animal.WildDog;
import com.esraa.creationaldesignpatterns.abstractfactorypattern.animal.WildTiger;

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

package com.esraa.creationaldesignpatterns.abstractfactorypattern.factory;

import com.esraa.creationaldesignpatterns.abstractfactorypattern.animal.Dog;
import com.esraa.creationaldesignpatterns.abstractfactorypattern.animal.Tiger;

public abstract class AnimalFactory {

    public abstract Dog createDog(String color);

    public abstract Tiger createTiger(String color);

}

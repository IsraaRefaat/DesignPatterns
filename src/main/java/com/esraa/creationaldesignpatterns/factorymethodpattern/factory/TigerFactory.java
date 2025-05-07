package com.esraa.creationaldesignpatterns.factorymethodpattern.factory;

import com.esraa.creationaldesignpatterns.factorymethodpattern.animal.Animal;
import com.esraa.creationaldesignpatterns.factorymethodpattern.animal.Tiger;

public class TigerFactory extends AnimalFactory {
    @Override
    public Animal createAnimal(String color) {
        return new Tiger(color);
    }
}

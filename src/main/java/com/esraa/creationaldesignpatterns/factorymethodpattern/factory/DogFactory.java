package com.esraa.creationaldesignpatterns.factorymethodpattern.factory;

import com.esraa.creationaldesignpatterns.factorymethodpattern.animal.Animal;
import com.esraa.creationaldesignpatterns.factorymethodpattern.animal.Dog;

public class DogFactory extends AnimalFactory {


    @Override
    public Animal createAnimal(String color) {
        return new Dog(color);
    }
}

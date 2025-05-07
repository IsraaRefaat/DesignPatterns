package com.esraa.creationaldesignpatterns.factorymethodpattern.factory;

import com.esraa.creationaldesignpatterns.factorymethodpattern.animal.Animal;

public abstract class AnimalFactory {
    public abstract Animal createAnimal(String color);
}

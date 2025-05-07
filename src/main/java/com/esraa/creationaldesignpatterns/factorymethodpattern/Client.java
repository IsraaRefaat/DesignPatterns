package com.esraa.creationaldesignpatterns.factorymethodpattern;


import com.esraa.creationaldesignpatterns.factorymethodpattern.animal.Animal;
import com.esraa.creationaldesignpatterns.factorymethodpattern.factory.AnimalFactory;
import com.esraa.creationaldesignpatterns.factorymethodpattern.factory.DogFactory;

public class Client {
    public static void main(String[] args) {
        AnimalFactory factory = new DogFactory();
        Animal dog = factory.createAnimal("red");
        dog.displayBehavior();
    }
}

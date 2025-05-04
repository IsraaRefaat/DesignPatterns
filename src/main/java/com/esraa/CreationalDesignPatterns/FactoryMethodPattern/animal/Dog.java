package com.esraa.CreationalDesignPatterns.FactoryMethodPattern.animal;

public class Dog implements Animal {

    public Dog(String color) {
        System.out.println("Dog with color: " + color);
    }

    @Override
    public void displayBehavior() {
        System.out.println("Haw haw lol");
    }
}

package com.esraa.CreationalDesignPatterns.FactoryMethodPattern.animal;

public class Tiger implements Animal {

    public Tiger(String color) {
        System.out.println("Tiger with color: " + color);
    }

    @Override
    public void displayBehavior() {
        System.out.println("Tiger displayBehavior");
    }
}

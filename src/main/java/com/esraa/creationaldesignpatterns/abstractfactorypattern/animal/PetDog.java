package com.esraa.creationaldesignpatterns.abstractfactorypattern.animal;

public class PetDog implements Dog {

    public PetDog(String color) {
        System.out.println("Pet Dog with color: " + color);
    }

}

package com.esraa.creationaldesignpatterns.abstractfactorypattern.animal;

public class WildTiger implements Tiger {

    public WildTiger(String color) {
        System.out.println("Wild Tiger with color: " + color);
    }

}

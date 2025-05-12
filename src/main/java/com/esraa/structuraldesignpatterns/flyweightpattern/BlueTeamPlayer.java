package com.esraa.structuraldesignpatterns.flyweightpattern;

public class BlueTeamPlayer extends Player {
    @Override
    public void render() {
        System.out.println("The team mission is " + mission+ ", The team weapon is "+ weapon);
    }
}

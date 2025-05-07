package com.esraa.behavioraldesignpatterns.strategypattern.flybehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with Wings");
    }
}

package com.esraa.BehavioralDesignPatterns.StrategyDP.QuackBehaviorP;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak Squeak");
    }
}

package com.esraa.BehavioralDesignPatterns.StrategyDP.FlyBehaviorP;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with Wings");
    }
}

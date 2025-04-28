package com.esraa.BehavioralDesignPatterns.StrategyDP.QuackBehaviorP;

import com.esraa.BehavioralDesignPatterns.StrategyDP.FlyBehaviorP.FlyBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack Quack");
    }
}

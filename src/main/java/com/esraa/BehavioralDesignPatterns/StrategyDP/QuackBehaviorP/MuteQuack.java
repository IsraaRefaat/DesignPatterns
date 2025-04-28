package com.esraa.BehavioralDesignPatterns.StrategyDP.QuackBehaviorP;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Mute Quack");
    }
}

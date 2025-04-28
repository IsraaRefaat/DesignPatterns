package com.esraa.BehavioralDesignPatterns.StrategyDP.Client;

import com.esraa.BehavioralDesignPatterns.StrategyDP.FlyBehaviorP.FlyWithWings;
import com.esraa.BehavioralDesignPatterns.StrategyDP.QuackBehaviorP.MuteQuack;

public class DuckGame {
    public static void main(String[] args) {
        Duck redheadDuck = new RedHeadDuck();
        redheadDuck.setFlyBehavior(new FlyWithWings());
        redheadDuck.setQuackBehavior(new MuteQuack());
        redheadDuck.performFly();
        redheadDuck.performQuack();
        redheadDuck.display();
    }
}

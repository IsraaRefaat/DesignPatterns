package com.esraa.behavioraldesignpatterns.strategypattern.client;

import com.esraa.behavioraldesignpatterns.strategypattern.flybehavior.FlyWithWings;
import com.esraa.behavioraldesignpatterns.strategypattern.quackbehavior.MuteQuack;

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

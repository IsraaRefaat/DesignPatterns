package com.esraa.behavioraldesignpatterns.strategypattern.quackbehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Mute Quack");
    }
}

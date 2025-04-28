package com.esraa.BehavioralDesignPatterns.StrategyDP.Client;

import com.esraa.BehavioralDesignPatterns.StrategyDP.FlyBehaviorP.FlyBehavior;
import com.esraa.BehavioralDesignPatterns.StrategyDP.QuackBehaviorP.QuackBehavior;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("Duck swimming");
    }

    public abstract void display();
}

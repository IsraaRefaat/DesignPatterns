package com.esraa.structuraldesignpatterns.decoratorpattern.decoratoraddons;

import com.esraa.structuraldesignpatterns.decoratorpattern.basicbeverage.Beverage;

public class Mocha extends Decorator{
    protected Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost(){
        return beverage.cost() + 2.5;
    }
}

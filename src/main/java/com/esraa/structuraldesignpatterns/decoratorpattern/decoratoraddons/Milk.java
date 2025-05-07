package com.esraa.structuraldesignpatterns.decoratorpattern.decoratoraddons;

import com.esraa.structuraldesignpatterns.decoratorpattern.basicbeverage.Beverage;

public class Milk extends Decorator {
    protected Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Milk";
    }

    public double cost(){
        return beverage.cost() + 2.0;
    }
}

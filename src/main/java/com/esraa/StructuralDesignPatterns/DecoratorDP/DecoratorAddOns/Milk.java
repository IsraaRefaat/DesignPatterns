package com.esraa.StructuralDesignPatterns.DecoratorDP.DecoratorAddOns;

import com.esraa.StructuralDesignPatterns.DecoratorDP.BasicBeverage.Beverage;

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

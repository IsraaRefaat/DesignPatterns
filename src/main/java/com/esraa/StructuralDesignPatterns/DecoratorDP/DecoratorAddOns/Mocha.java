package com.esraa.StructuralDesignPatterns.DecoratorDP.DecoratorAddOns;

import com.esraa.StructuralDesignPatterns.DecoratorDP.BasicBeverage.Beverage;

import java.beans.beancontext.BeanContext;

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

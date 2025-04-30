package com.esraa.StructuralDesignPatterns.DecoratorDP.BasicBeverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost(){
        return 5.0;
    }
}

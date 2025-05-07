package com.esraa.structuraldesignpatterns.decoratorpattern.basicbeverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost(){
        return 5.0;
    }
}

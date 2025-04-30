package com.esraa.StructuralDesignPatterns.DecoratorDP.BasicBeverage;

public abstract class Beverage {
     protected String description = "Unknown";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}

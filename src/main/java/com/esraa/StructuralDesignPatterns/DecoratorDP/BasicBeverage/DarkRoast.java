package com.esraa.StructuralDesignPatterns.DecoratorDP.BasicBeverage;

public class DarkRoast extends Beverage{

    public DarkRoast(){
        description = "Dark Roast";
    }

    public double cost(){
        return 4.0;
    }
}

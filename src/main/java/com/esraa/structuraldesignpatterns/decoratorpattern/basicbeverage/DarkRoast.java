package com.esraa.structuraldesignpatterns.decoratorpattern.basicbeverage;

public class DarkRoast extends Beverage{

    public DarkRoast(){
        description = "Dark Roast";
    }

    public double cost(){
        return 4.0;
    }
}

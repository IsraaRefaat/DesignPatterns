package com.esraa.StructuralDesignPatterns.DecoratorDP.DecoratorAddOns;

import com.esraa.StructuralDesignPatterns.DecoratorDP.BasicBeverage.Beverage;

public abstract class Decorator extends Beverage {
    public abstract String getDescription();
}

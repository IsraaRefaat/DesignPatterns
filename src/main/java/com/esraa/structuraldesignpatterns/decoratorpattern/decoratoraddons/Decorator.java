package com.esraa.structuraldesignpatterns.decoratorpattern.decoratoraddons;

import com.esraa.structuraldesignpatterns.decoratorpattern.basicbeverage.Beverage;

public abstract class Decorator extends Beverage {
    public abstract String getDescription();
}

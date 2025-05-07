package com.esraa.creationaldesignpatterns.prototypepattern;

public class CarA extends BasicCar{

    public BasicCar clone() throws CloneNotSupportedException {
        return (CarA)super.clone();
    }

}

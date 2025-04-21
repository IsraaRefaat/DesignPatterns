package com.esraa.CreationalDesignPatterns.PrototypePattern;

public class CarA extends BasicCar{

    public BasicCar clone() throws CloneNotSupportedException {
        return (CarA)super.clone();
    }

}

package com.esraa.creationaldesignpatterns.prototypepattern;

public abstract class BasicCar implements Cloneable{

    public BasicCar clone() throws CloneNotSupportedException {
            return (BasicCar)super.clone();
    }
}

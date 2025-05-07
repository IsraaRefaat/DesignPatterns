package com.esraa.structuraldesignpatterns.decoratorpattern;

import com.esraa.structuraldesignpatterns.decoratorpattern.basicbeverage.Beverage;
import com.esraa.structuraldesignpatterns.decoratorpattern.basicbeverage.Espresso;
import com.esraa.structuraldesignpatterns.decoratorpattern.decoratoraddons.Milk;
import com.esraa.structuraldesignpatterns.decoratorpattern.decoratoraddons.Mocha;

public class Client {
    public static void main(String[] args) {

        Beverage espresso = new Espresso();
        espresso = new Milk(espresso);
        espresso = new Mocha(espresso);

        System.out.println(espresso.getDescription());
        System.out.println(espresso.cost());


    }
}

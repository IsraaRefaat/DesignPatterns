package com.esraa.StructuralDesignPatterns.DecoratorDP;

import com.esraa.StructuralDesignPatterns.DecoratorDP.BasicBeverage.Beverage;
import com.esraa.StructuralDesignPatterns.DecoratorDP.BasicBeverage.Espresso;
import com.esraa.StructuralDesignPatterns.DecoratorDP.DecoratorAddOns.Decorator;
import com.esraa.StructuralDesignPatterns.DecoratorDP.DecoratorAddOns.Milk;
import com.esraa.StructuralDesignPatterns.DecoratorDP.DecoratorAddOns.Mocha;

public class Client {
    public static void main(String[] args) {

        Beverage espresso = new Espresso();
        espresso = new Milk(espresso);
        espresso = new Mocha(espresso);

        System.out.println(espresso.getDescription());
        System.out.println(espresso.cost());


    }
}

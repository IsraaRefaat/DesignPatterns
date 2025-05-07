package com.esraa.creationaldesignpatterns.simplefactory;

public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing CheesePizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking CheesePizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting CheesePizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing CheesePizza");
    }
}

package com.esraa.creationaldesignpatterns.simplefactory;

public class VeggiePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing Veggie Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Veggie Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Veggie Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing Veggie Pizza");
    }
}

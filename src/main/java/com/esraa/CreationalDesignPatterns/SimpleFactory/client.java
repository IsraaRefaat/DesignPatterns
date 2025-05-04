package com.esraa.CreationalDesignPatterns.SimpleFactory;

public class client {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore(new SimplePizzaFactory());
        store.orderPizza("cheese");
        System.out.println("######");
        store.orderPizza("veggie");
    }
}

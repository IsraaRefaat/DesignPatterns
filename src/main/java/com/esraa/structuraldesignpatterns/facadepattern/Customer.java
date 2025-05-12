package com.esraa.structuraldesignpatterns.facadepattern;

public class Customer {

     String name;
     double assetsValue;
     boolean isThereAnyPreviousLoan;

    public Customer(String name, double assetsValue, boolean isThereAnyExistLoan) {
        this.name = name;
        this.assetsValue = assetsValue;
        this.isThereAnyPreviousLoan = isThereAnyExistLoan;
    }

}

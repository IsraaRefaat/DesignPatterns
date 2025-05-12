package com.esraa.structuraldesignpatterns.facadepattern;

public class Asset {

    public boolean hasSufficientAssetsValue(Customer customer, double desiredLoanAmount) {
        return customer.assetsValue >= desiredLoanAmount;
    }

}

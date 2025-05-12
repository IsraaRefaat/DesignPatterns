package com.esraa.structuraldesignpatterns.facadepattern;

public class LoanStatus {

    public boolean hasPreviousLoans(Customer customer) {
        return customer.isThereAnyPreviousLoan;
    }

}

package com.esraa.structuraldesignpatterns.facadepattern;

public class Client {
    public static void main(String[] args) {

        LoanApproverFacade facade = new LoanApproverFacade();
        Customer customer = new Customer("Ali", 10000, true);

        System.out.println(facade.CheckLoanEligibility(customer, 50000));

        customer = new Customer("Bob", 10000, false);
        System.out.println(facade.CheckLoanEligibility(customer, 5000));


    }
}

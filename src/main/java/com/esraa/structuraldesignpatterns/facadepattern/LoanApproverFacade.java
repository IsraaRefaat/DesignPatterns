package com.esraa.structuraldesignpatterns.facadepattern;

public class LoanApproverFacade {
    Asset asset;
    LoanStatus loan;

    public LoanApproverFacade() {
        asset = new Asset();
        loan = new LoanStatus();
    }

    public String CheckLoanEligibility(Customer customer, double desiredLoanAmount) {
        if (customer.isThereAnyPreviousLoan) {
            return "Not Approved";
        }

        if(!asset.hasSufficientAssetsValue(customer, desiredLoanAmount)) {
            return "Not Approved";
        }

        return "Approved";
    }

}

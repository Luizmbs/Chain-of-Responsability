package org.example;

public class LoanRenewalRequest implements RequestType {

    private static LoanRenewalRequest instance = new LoanRenewalRequest();

    private LoanRenewalRequest() {};

    public static LoanRenewalRequest getInstance() {
        return instance;
    }
}

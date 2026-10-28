package org.example;

public class InterlibraryLoanRequest implements RequestType {

    private static InterlibraryLoanRequest instance = new InterlibraryLoanRequest();

    private InterlibraryLoanRequest() {};

    public static InterlibraryLoanRequest getInstance() {
        return instance;
    }
}

package org.example;

public class FineWaiverRequest implements RequestType {

    private static FineWaiverRequest instance = new FineWaiverRequest();

    private FineWaiverRequest() {};

    public static FineWaiverRequest getInstance() {
        return instance;
    }
}

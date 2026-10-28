package org.example;

public class RareCollectionAccessRequest implements RequestType {

    private static RareCollectionAccessRequest instance = new RareCollectionAccessRequest();

    private RareCollectionAccessRequest() {};

    public static RareCollectionAccessRequest getInstance() {
        return instance;
    }
}

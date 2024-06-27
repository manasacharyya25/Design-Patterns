package org.example.product;

public class FeaturePhone extends Phone {
    @Override
    void call() {
        System.out.println("Calling with Feature Phone");
    }

    @Override
    void text() {
        System.out.println("Calling with Feature Phone");
    }

    @Override
    void videoCall() throws Exception {
        throw new Exception("Feature Not Available");
    }

    @Override
    void turnOff() {
        System.out.println("Feature Phone turning off");
    }
}

package org.example.product;

public class SmartPhone extends Phone{
    @Override
    void call() {
        System.out.println("Calling using Smart Phone");
    }

    @Override
    void text() {
        System.out.println("Texting using Smart Phone");
    }

    @Override
    void videoCall() throws Exception {
        System.out.println("Video Calling using Smart Phone");
    }

    @Override
    void turnOff() {
        System.out.println("Smart Phone turning off");
    }
}

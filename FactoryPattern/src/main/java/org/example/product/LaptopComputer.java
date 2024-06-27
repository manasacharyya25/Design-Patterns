package org.example.product;

public class LaptopComputer extends Computer {
    @Override
    void browse() {
        System.out.println("Browsing in Laptop Computer");
    }

    @Override
    void playGames() {
        System.out.println("Playing in Laptop Computer");
    }

    @Override
    void turnOff() {
        System.out.println("Laptop Turning Off");
    }
}

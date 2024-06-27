package org.example.product;

public class DesktopComputer extends Computer {
    @Override
    void browse() {
        System.out.println("Browsing in Desktop Computer");
    }

    @Override
    void playGames() {
        System.out.println("Playing in Desktop Computer");
    }

    @Override
    void turnOff() {
        System.out.println("Desktop turning off");
    }
}

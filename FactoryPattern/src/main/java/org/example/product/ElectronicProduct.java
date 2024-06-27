package org.example.product;

public abstract class ElectronicProduct {
    void turnOn() {
        System.out.println(this.getClass().getSimpleName()+ "turning on");
    }

    abstract void turnOff();
}

package org.example.factory;

import org.example.product.*;

public class ComputerFactory extends ElectronicProductAbstractFactory{
    public static Computer getComputer(String type) {
        switch(type) {
            case "DESKTOP":
                return new DesktopComputer();
            case "LAPTOP":
                return new LaptopComputer();
            default:
                return null;
        }
    }

    @Override
    public Computer getProduct(String type) {
        return getComputer(type);
    }
}

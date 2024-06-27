package org.example.factory;

public class FactoryProducer {
    public static ElectronicProductAbstractFactory getElectronicProductFactory(String type) {
        switch (type) {
            case "PHONE":
                return new PhoneFactory();
            case "COMPUTER":
                return new ComputerFactory();
            default:
                return null;
        }
    }
}

package org.example;

import org.example.factory.ComputerFactory;
import org.example.factory.FactoryProducer;
import org.example.factory.PhoneFactory;
import org.example.product.Computer;
import org.example.product.Phone;

public class Client {
    public static void main(String[] args) {
        // USING CONCRETE FACTORY
        Phone featurePhone = PhoneFactory.getPhone("FEATURE");
        Phone smartPhone = PhoneFactory.getPhone("SMART");

        // USING ABSTRACT FACTORY
        PhoneFactory phoneFactory = (PhoneFactory) FactoryProducer.getElectronicProductFactory("PHONE");
        Phone featurePhone2 = (Phone) phoneFactory.getProduct("FEATURE");

        ComputerFactory computerFactory = (ComputerFactory) FactoryProducer.getElectronicProductFactory("COMPUTER");
        Computer desktopComputer = computerFactory.getProduct("DESKTOP");
    }
}
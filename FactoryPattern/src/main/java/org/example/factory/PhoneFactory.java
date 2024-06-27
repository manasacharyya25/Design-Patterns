package org.example.factory;

import org.example.product.ElectronicProduct;
import org.example.product.FeaturePhone;
import org.example.product.Phone;
import org.example.product.SmartPhone;

public class PhoneFactory extends ElectronicProductAbstractFactory{
    public static Phone getPhone(String type) {
        switch(type) {
            case "FEATURE":
                return new FeaturePhone();
            case "SMART":
                return new SmartPhone();
            default:
                return null;
        }
    }

    @Override
    public ElectronicProduct getProduct(String type) {
        return PhoneFactory.getPhone(type);
    }
}

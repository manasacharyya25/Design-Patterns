package org.example.factory;

import org.example.product.Computer;
import org.example.product.ElectronicProduct;
import org.example.product.Phone;

public abstract class ElectronicProductAbstractFactory {
    abstract ElectronicProduct getProduct(String type);
}

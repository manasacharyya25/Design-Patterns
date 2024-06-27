package org.example.product;

public abstract class Phone extends ElectronicProduct{
    abstract void call();
    abstract void text();
    abstract void videoCall() throws Exception;
}

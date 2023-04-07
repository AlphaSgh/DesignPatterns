package com.ssgh.SimpleFactoryPattern.test1;

public class Factory {
    public static Product getProduct(String str) {
        Product product = null;
        if (str.equalsIgnoreCase("A")) {
            product = new ConcreteProductA();
        }
        if (str.equalsIgnoreCase("B")) {
            product = new ConcreteProductB();
        }
        return product;
    }
}

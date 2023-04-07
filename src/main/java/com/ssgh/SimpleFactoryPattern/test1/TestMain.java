package com.ssgh.SimpleFactoryPattern.test1;

public class TestMain {
    public static void main(String[] args) {
        Product aProduct = Factory.getProduct("A");
        Product bProduct = Factory.getProduct("B");
        aProduct.methodDiff();
        bProduct.methodDiff();
    }
}

package com.ssgh.abstractFactoryPattern;

public class SpringTextField implements TextField{
    @Override
    public void display() {
        System.out.println("spring TextField");
    }
}

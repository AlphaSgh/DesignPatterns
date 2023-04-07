package com.ssgh.abstractFactoryPattern;

public class SpringButton implements Button{
    @Override
    public void display() {
        System.out.println("spring button");
    }
}

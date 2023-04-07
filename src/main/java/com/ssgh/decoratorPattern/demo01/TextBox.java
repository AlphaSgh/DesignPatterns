package com.ssgh.decoratorPattern.demo01;

public class TextBox implements Component{

    @Override
    public void display() {
        System.out.println("display TextBox");
    }
}

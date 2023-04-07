package com.ssgh.decoratorPattern.demo01;

public class Window implements Component{
    @Override
    public void display() {
        System.out.println("display windows");
    }
}

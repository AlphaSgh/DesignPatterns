package com.ssgh.decoratorPattern.demo01;

//具体构件（Concrete Component）角色：该角色实现抽象构件接口，定义一个需要装饰的原始类。
public class ListBox implements Component{
    @Override
    public void display() {
        System.out.println("listBox display");
    }
}

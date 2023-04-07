package com.ssgh.decoratorPattern.demo01;

public class BlackBorderDecorator extends ComponentDecorator{

    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.addBlackBorder();
        super.display();
    }
    public void addBlackBorder() {
        System.out.println("为构件增加BlackBorder");
    }
}

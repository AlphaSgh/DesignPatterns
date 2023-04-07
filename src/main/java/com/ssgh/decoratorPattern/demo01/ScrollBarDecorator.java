package com.ssgh.decoratorPattern.demo01;

//具体装饰（Concrete Decorator）角色：该角色负责对构件对象进行装饰。
public class ScrollBarDecorator extends ComponentDecorator{
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.addScrollBar();
        super.display();
    }
    public void addScrollBar() {
        System.out.println("为构件增加滚动条");
    }
}

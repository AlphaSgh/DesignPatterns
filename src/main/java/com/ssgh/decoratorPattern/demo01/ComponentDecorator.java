package com.ssgh.decoratorPattern.demo01;

//装饰（Decorator）角色：该角色持有一个构件对象的实例，并定义一个与抽象构件接口一致的接口。
public class ComponentDecorator implements Component{
    private Component component;
    public ComponentDecorator(Component component) {
        this.component = component;
    }
    @Override
    public void display() {
        component.display();
    }
}

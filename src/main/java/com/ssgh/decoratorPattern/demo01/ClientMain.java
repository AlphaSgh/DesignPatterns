package com.ssgh.decoratorPattern.demo01;

public class ClientMain {
    public static void main(String[] args) {
        Component component, componentSB, componentBB;
        component = new Window();
        componentSB = new ScrollBarDecorator(component);
        componentBB = new BlackBorderDecorator(componentSB);
        componentBB.display();

        Component listBoxComponent, listBoxComponentSB, listBoxComponentBB;
        listBoxComponent = new ListBox();
        listBoxComponentSB = new ScrollBarDecorator(listBoxComponent);
        listBoxComponentBB = new BlackBorderDecorator(listBoxComponentSB);
        listBoxComponentBB.display();
    }
}

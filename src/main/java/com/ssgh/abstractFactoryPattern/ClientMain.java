package com.ssgh.abstractFactoryPattern;

public class ClientMain {
    public static void main(String[] args) throws Exception {
        SkinFactory skinFactory;
        Button button;
        TextField textField;
        ComboBox comboBox;
        skinFactory = (SkinFactory) ProPertiesUtil.getBean();
        button = skinFactory.createButton();
        textField = skinFactory.createTextField();
        comboBox = skinFactory.createComboBox();
        button.display();
        textField.display();
        comboBox.display();
    }
}

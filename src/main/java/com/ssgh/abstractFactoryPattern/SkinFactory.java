package com.ssgh.abstractFactoryPattern;

public interface SkinFactory {
    public Button createButton();
    public TextField createTextField();
    public ComboBox createComboBox();
}

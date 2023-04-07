package com.ssgh.commandPattern.demo01;

import java.util.ArrayList;

public class FBSettingWindow {
    private String title;//窗口标题
    private ArrayList<FunctionButton> functionButtons = new ArrayList<>();
    public FBSettingWindow(String title) {
        this.title = title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return this.title;
    }
    public void addFunctionButton(FunctionButton functionButton) {
        this.functionButtons.add(functionButton);
    }
    public void removeFunctionButton(FunctionButton functionButton) {
        this.functionButtons.remove(functionButton);
    }
    public void display() {
        System.out.println("显示窗口：" + this.title);
        System.out.println("显示功能键");
        for (Object o :
                functionButtons) {
            System.out.println(((FunctionButton) o).getName());
        }
        System.out.println("------------------------------");
    }
}

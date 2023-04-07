package com.ssgh.commandPattern.demo02;

//加法类：请求接收者
public class Adder {
    private int num = 0;
    public int add(int value) {
        this.num += value;
        return this.num;
    }
}

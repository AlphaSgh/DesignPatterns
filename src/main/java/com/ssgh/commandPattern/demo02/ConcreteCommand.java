package com.ssgh.commandPattern.demo02;

//具体命令类
public class ConcreteCommand implements AbstractCommand{
    private Adder adder;
    private int value;

    public ConcreteCommand() {
        this.adder = new Adder();
    }

    @Override
    public int execute(int value) {
        this.value = value;
        return adder.add(value);
    }

    @Override
    public int undo() {
        return adder.add(-value);
    }
}

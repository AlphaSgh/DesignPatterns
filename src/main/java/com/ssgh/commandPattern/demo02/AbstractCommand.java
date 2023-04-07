package com.ssgh.commandPattern.demo02;

//抽象命令接口
public interface AbstractCommand {
    public int execute(int value);
    public int undo();
}

package com.ssgh.commandPattern.demo01;

public class MinimizeCommand implements Command{
    private WindowHanlder windowHanlder;
    public MinimizeCommand(){
        windowHanlder = new WindowHanlder();
    }
    @Override
    public void execute() {
        windowHanlder.minimize();
    }
}

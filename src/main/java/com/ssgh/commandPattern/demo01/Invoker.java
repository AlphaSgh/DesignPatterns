package com.ssgh.commandPattern.demo01;

//请求发送者类
public class Invoker {
    private CommandQueue commandQueue;
    public Invoker() {
        this.commandQueue = new CommandQueue();
    }
    public void setCommandQueue(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }
    public void call() {
        commandQueue.execute();
    }
}

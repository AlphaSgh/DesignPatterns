package com.ssgh.commandPattern.demo01;

public class HelpCommand implements Command{
    private HelpHandler helpHandler;
    public HelpCommand() {
        helpHandler = new HelpHandler();
    }
    @Override
    public void execute() {
        helpHandler.display();
    }
}

package com.ssgh.commandPattern.demo01;

public class ClientMian {
    public static void main(String[] args) {
        FBSettingWindow fbsw = new FBSettingWindow("功能键设置");

        FunctionButton fb1, fb2;
        fb1 = new FunctionButton("功能键1");
        fb2 = new FunctionButton("功能键2");

        Command command1, command2;
        command1 = new HelpCommand();
        command2 = new MinimizeCommand();

        fb1.setCommand(command1);
        fb1.setCommand(command2);

        fb2.setCommand(command1);
        fb2.setCommand(command2);
        fbsw.addFunctionButton(fb1);
        fbsw.addFunctionButton(fb2);
        fbsw.display();

        fb2.onClick();
        fb1.onClick();
    }
}

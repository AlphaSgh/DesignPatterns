package com.ssgh.commandPattern.demo02;


public class ClientMain {
    public static void main(String[] args) {
        CalculatorForm form = new CalculatorForm();
        AbstractCommand command = new ConcreteCommand();
        form.setCommand(command);

        form.compute(10);
        form.compute(19);
        form.compute(1);
        form.undo();
    }
}

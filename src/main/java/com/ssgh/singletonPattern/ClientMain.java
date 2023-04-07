package com.ssgh.singletonPattern;

public class ClientMain {
    public static void main(String[] args) {
        LoadBalance balance1, balance2, balance3, balance4;
        balance1 = LoadBalance.getInstance();
        balance2 = LoadBalance.getInstance();
        balance3 = LoadBalance.getInstance();
        balance4 = LoadBalance.getInstance();

        if (balance1 == balance2 && balance2 == balance3 && balance3 == balance4) {
            System.out.println("only one instance");
        }
        balance1.addServer("server 1");
        balance1.addServer("server 2");
        balance1.addServer("server 3");
        balance1.addServer("server 4");

        for (int i = 0; i < 10; i++) {
            String server = balance1.getServer();
            System.out.println("分发请求至服务器-->" + server);
        }

    }
}

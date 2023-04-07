package com.ssgh.singletonPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoadBalance {
    //私有静态成员变量，存储唯一实例
    private static LoadBalance instance = null;
    //服务期集合
    private List serverList = null;
    private LoadBalance() {
        serverList = new ArrayList<>();
    }
    public static LoadBalance getInstance() {
        if (instance == null) {
            instance = new LoadBalance();
        }
        return instance;
    }
    public void addServer(String server) {
        serverList.add(server);
    }
    public void deleteServer(String server) {
        serverList.remove(server);
    }
    public String getServer() {
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return (String) serverList.get(i);
    }
}

package com.ssgh.proxyPattern.staticProxyPattern;

//真实主题角色Real Subject：也叫做被委托角色、被代理角色，是业务逻辑的具体执行者。
public class SmsServiceImpl implements SmsService{
    @Override
    public String send(String msg) {
        System.out.println("send msg " + msg);
        return msg;
    }
}

package com.ssgh.proxyPattern.jdkProxyPattern;

public class SmsServiceImpl implements SmsService{
    @Override
    public String send(String message) {
        System.out.println("message : " + message);
        return message;
    }

    @Override
    public String accept(String message) {
        System.out.println("accept : " + message);
        return message;
    }
}

package com.ssgh.proxyPattern.staticProxyPattern;

public class ClientMian {
    public static void main(String[] args) {
        SmsService smsService = new SmsServiceImpl();
        SmsProxy smsProxy = new SmsProxy();
        String send = smsProxy.send("java");
        System.out.println(send);
    }
}

package com.ssgh.proxyPattern.jdkProxyPattern;

public class ClientMian {
    public static void main(String[] args) {
        SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        String send = smsService.send("java");
        System.out.println(send);
        String accept = smsService.accept("accept");
        System.out.println(accept);
    }
}

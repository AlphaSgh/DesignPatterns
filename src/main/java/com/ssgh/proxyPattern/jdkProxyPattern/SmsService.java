package com.ssgh.proxyPattern.jdkProxyPattern;

public interface SmsService {
    String send(String message);
    String accept(String message);
}

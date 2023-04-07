package com.ssgh.proxyPattern.staticProxyPattern;

//抽象主题角色Subject：是真实主题和代理主题的共同接口，以便在任何可以使用真实主题的地方都可以使用代理主题。
public interface SmsService {
    String send(String msg);
}

package com.ssgh.proxyPattern.staticProxyPattern;

//代理主题角色Proxy Subject：也叫做委托类、代理类，该角色负责控制对真实主题的引用，
//负责在需要的时候创建或删除真实主题对象，并且在真实主题角色处理完毕前后做预处理和善后处理工作。
public class SmsProxy implements SmsService{
    private final SmsService smsService;
    public SmsProxy() {
        this.smsService = new SmsServiceImpl();
    }
    @Override
    public String send(String msg) {
        System.out.println("before method send()");
        String send = smsService.send(msg);
        System.out.println("after method send()");
        return send;
    }
}

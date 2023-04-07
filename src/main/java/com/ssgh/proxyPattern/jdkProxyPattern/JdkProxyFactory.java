package com.ssgh.proxyPattern.jdkProxyPattern;

import java.lang.reflect.Proxy;

public class JdkProxyFactory {
    public static Object getProxy(Object target) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new jdkProxyInvocationHandler(target)
        );
    }
}

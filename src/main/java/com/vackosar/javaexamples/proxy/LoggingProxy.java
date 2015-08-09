package com.vackosar.javaexamples.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.atomic.AtomicReference;

public class LoggingProxy implements InvocationHandler{

    final private Object object;
    private String proxyMessage;

    private LoggingProxy(Object object) {
        this.object = object;
    }

    public String getProxyMessage() {
        return proxyMessage;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.proxyMessage = "Executing method: " + method.getName();
        return method.invoke(object, args);
    }

    public static Object create(Object object) {
        return java.lang.reflect.Proxy.newProxyInstance(
                object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                new LoggingProxy(object));
    }
}

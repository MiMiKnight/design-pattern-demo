package com.github.mimiknight.designpattern.type02.pattern07.case02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK代理增强类
 */
public class ServiceJDKProxy implements InvocationHandler {

    /**
     * 被代理的目标对象
     */
    private final Object target;

    public ServiceJDKProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 方法执行前
        System.out.println("方法执行前增强");
        // 被代理方法执行
        Object result = method.invoke(this.target, args);
        // 方法执行后
        System.out.println("方法执行后增强");

        return result;
    }
}

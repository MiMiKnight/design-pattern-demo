package com.github.mimiknight.designpattern.type02.pattern07.case02;

import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 */
public class Main {
    public static void main(String[] args) {

        // 代理类要实现的接口列表
        Class<?>[] interfaces = {BlogService.class};

        // 被代理对象的接口实现类
        BlogService blogService = new BlogServiceImpl();

        // 定义代理类的类加载器
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        // 委派增强方法的代理类（实现InvocationHandler接口的代理类对象）
        ServiceJDKProxy blogServiceProxy = new ServiceJDKProxy(blogService);
        // 生成被代理增强的BlogService对象
        BlogService blogServiceProxyEnhance = (BlogService) Proxy.newProxyInstance(classLoader, interfaces, blogServiceProxy);


        blogServiceProxyEnhance.add();
        System.out.println("===================");
        blogServiceProxyEnhance.edit();
    }
}

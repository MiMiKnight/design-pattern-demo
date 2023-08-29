package com.github.mimiknight.designpattern.type02.pattern07.case03;

/**
 * CGLIB 动态代理
 */
public class Main {
    public static void main(String[] args) {

        // 被代理对象的接口实现类
        BlogService blogService = new BlogServiceImpl();

        BlogService blogServiceProxyEnhance = (BlogService) new ServiceCglibProxy(blogService).getProxyInstance();

        blogServiceProxyEnhance.add();
        System.out.println("===================");
        blogServiceProxyEnhance.edit();
    }
}

package com.github.mimiknight.designpattern.type02.pattern07.case03;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLIB代理服务类
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2023-08-29 21:59:31
 */
public class ServiceCglibProxy implements MethodInterceptor {

    private final Object target;

    public ServiceCglibProxy(Object target) {
        this.target = target;
    }

    /**
     * 获得代理实例
     *
     * @return {@link Object}
     */
    public Object getProxyInstance() {
        // 1.工具类
        Enhancer enhancer = new Enhancer();
        // 2.设置父类
        enhancer.setSuperclass(target.getClass());
        // 3.设置回调函数
        enhancer.setCallback(this);
        // 4.创建子类（代理对象）
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // 方法执行前
        System.out.println("方法执行前增强");
        Object result = method.invoke(target, objects);
        // 方法执行后
        System.out.println("方法执行后增强");
        return result;
    }
}

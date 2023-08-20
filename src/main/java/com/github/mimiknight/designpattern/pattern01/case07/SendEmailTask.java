package com.github.mimiknight.designpattern.pattern01.case07;

/**
 * 单例设计模式：枚举方式
 * <p>
 * 是否线程安全：线程安全
 * <p>
 * 是否延迟加载：否
 * <p>
 * 描述： Effective Java 作者 Josh Bloch 提倡的方式
 * 不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化。
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2023-08-20 23:37:52
 */
public enum SendEmailTask {

    INSTANCE;

    public void doSomeThing() {

    }

}

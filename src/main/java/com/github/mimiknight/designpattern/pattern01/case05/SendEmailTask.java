package com.github.mimiknight.designpattern.pattern01.case05;

/**
 * 单例设计模式：懒汉式
 * <p>
 * 是否线程安全：线程安全
 * <p>
 * 是否延迟加载：延迟加载
 * <p>
 * 效率：效率提高
 * <p>
 * 描述：双重检查锁 DCL，volatile修饰
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2023-08-20 23:37:52
 */
public class SendEmailTask {

    private volatile static SendEmailTask instance;

    private SendEmailTask() {
    }

    /**
     * 获得实例
     *
     * @return {@link SendEmailTask}
     */
    public static SendEmailTask getInstance() {
        if (null == instance) {
            synchronized (SendEmailTask.class) {
                if (null == instance) {
                    instance = new SendEmailTask();
                }
            }
        }
        return instance;
    }

}

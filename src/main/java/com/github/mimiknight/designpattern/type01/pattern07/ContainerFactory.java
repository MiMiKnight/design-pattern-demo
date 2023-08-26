package com.github.mimiknight.designpattern.type01.pattern07;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainerFactory {

    /**
     * 单例容器
     */
    private static final Map<String, Object> singleton = new HashMap<>(128);
    /**
     * 原型容器
     */
    private static final Map<String, Class<?>> prototype = new HashMap<>(128);

    public ContainerFactory(String packagePath) {
        // 执行扫描获取被bean注解的class对象
        List<Class<?>> classes = ScanUtils.scan(packagePath, Bean.class);
        // 解析
        resolve(classes);
    }

    public void resolve(List<Class<?>> classes) {
        //遍历List集合
        if (null == classes || classes.isEmpty()) {
            return;
        }
        for (Class<?> clazz : classes) {
            //判断是否获取到注解
            if (!clazz.isAnnotationPresent(Bean.class)) {
                continue;
            }
            //获取注解的Value属性
            String value = clazz.getAnnotation(Bean.class).value();
            // 获取注解scope属性
            boolean scope = clazz.getAnnotation(Bean.class).scope();
            if (scope) {
                //通过class构建函数新建实例
                Object instance = newInstance(clazz);
                //将实例存储到容器中（map集合）
                singleton.put(value, instance);
            } else {  //如果为false则返回原型
                prototype.put(value, clazz);
            }
        }
    }

    /**
     * 根据calss对象创建实例
     *
     * @param clazz clazz
     * @return {@link Object}
     */
    private Object newInstance(Class<?> clazz) {
        try {
            return clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("创建实例失败", e);
        }
    }

    /**
     * 从容器中获取对象
     *
     * @param name 名字
     * @return {@link T}
     */
    public <T> T getBean(String name) {
        //获取单例，如果不是则返回原型
        Object instance = singleton.get(name);
        if (null == instance) {
            //否则返回原型
            Class<?> type = prototype.get(name);
            //新建实例
            instance = newInstance(type);
        }
        //返回单例
        return (T) instance;
    }


}

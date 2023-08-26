package com.github.mimiknight.designpattern.type01.pattern07;

import io.github.classgraph.ClassGraph;
import io.github.classgraph.ScanResult;

import java.lang.annotation.Annotation;
import java.util.List;

public class ScanUtils {

    /**
     * 扫描被指定注解标识的Class
     *
     * @param packagePath     包路径
     * @param annotationClass 注解Class
     * @return {@link List}<{@link Class}<{@link ?}>>
     */
    public static List<Class<?>> scan(String packagePath, Class<? extends Annotation> annotationClass) {
        // 创建核心类图对象
        ClassGraph classGraph = new ClassGraph();
        // 启用所有扫描机制
        classGraph.enableAllInfo();
        // 设置要扫描包的路径
        classGraph.acceptPackages(packagePath);
        // 执行并返回扫描的结果集
        try (ScanResult result = classGraph.scan()) {
            // 从结果集中获取所有的Class信息，加载到JVM中
            List<Class<?>> classes = result.getAllClasses().loadClasses();
            if (null == classes || classes.isEmpty()) {
                return classes;
            }
            // 删除集合中没有被指定注解标识的Class对象
            classes.removeIf(clazz -> !clazz.isAnnotationPresent(annotationClass));
            return classes;
        } catch (Exception e) {
            throw new RuntimeException("扫描发生异常", e);
        }
    }
}

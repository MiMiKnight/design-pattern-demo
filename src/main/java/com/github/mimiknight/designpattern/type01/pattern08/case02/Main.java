package com.github.mimiknight.designpattern.type01.pattern08.case02;

import java.util.ArrayList;
import java.util.List;

/**
 * 通过 Apache Common Lang3的 SerializationUtils.clone() 方法实现深拷贝
 * <p>
 * 前提是被拷贝的对象实现Cloneable, Serializable接口
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2023-08-26 19:37:27
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student01 = new Student();
        student01.setName("Jack");
        student01.setAge(18);
        ArrayList<String> hobby = new ArrayList<>();
        hobby.add("football");
        hobby.add("basketball");
        student01.setHobby(hobby);
        System.out.println("student01 = " + student01.toString());

        Student student02 = (Student) student01.clone();
        student02.setName("Mary");
        List<String> student02Hobby = student02.getHobby();
        student02Hobby.remove(1);
        student02Hobby.add("volleyball");
        System.out.println("student02 = " + student02.toString());

        System.out.println("student01 = " + student01.toString());
    }
}

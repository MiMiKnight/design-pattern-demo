package com.github.mimiknight.designpattern.type01.pattern08.case01;

import com.sun.org.apache.xpath.internal.operations.String;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Rectangle rectangle01 = new Rectangle();
        rectangle01.setId("001");
        rectangle01.setType("rectangle");
        System.out.println("rectangle01 :: hash = " + rectangle01.hashCode());

        Rectangle rectangle02 = (Rectangle) rectangle01.clone();
        rectangle02.setId("002");
        System.out.println("rectangle02 :: hash = " + rectangle02.hashCode());
    }
}

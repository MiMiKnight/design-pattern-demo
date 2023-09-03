package com.github.mimiknight.designpattern.type01.pattern07.case01;

import com.github.mimiknight.designpattern.type01.pattern06.case01.Phone;

@Bean(value = "xiaomi-phone", scope = true)
public class XiaoMiPhone implements Phone {
    @Override
    public void call() {
        System.out.println("XiaoMiPhone :: call()");
    }
}

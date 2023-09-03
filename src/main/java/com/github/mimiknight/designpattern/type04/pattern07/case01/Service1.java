package com.github.mimiknight.designpattern.type04.pattern07.case01;

/**
 * 创建实体服务
 */
public class Service1 implements Service{

    public void execute(){
        System.out.println("Executing Service1");
    }

    @Override
    public String getName() {
        return "Service1";
    }

}

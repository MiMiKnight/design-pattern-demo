package com.github.mimiknight.designpattern.type04.pattern02.case01;

/**
 * 创建客户端
 */
public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }

}

package com.github.mimiknight.designpattern.type04.pattern02.case01;

public class EJBService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}

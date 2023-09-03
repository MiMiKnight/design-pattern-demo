package com.github.mimiknight.designpattern.type04.pattern07.case01;

public class Main {
    public static void main(String[] args) {

        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        
    }
}

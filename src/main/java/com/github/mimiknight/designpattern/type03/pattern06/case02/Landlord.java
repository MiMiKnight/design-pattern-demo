package com.github.mimiknight.designpattern.type03.pattern06.case02;

public class Landlord extends Person {

    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setMessage(String message) {
        mediator.send(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("房东收到信息：" + message);
    }
}

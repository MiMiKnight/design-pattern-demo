package com.github.mimiknight.designpattern.type03.pattern06.case02;

/**
 * 中介抽象类
 */
public abstract class Mediator {

    abstract void send(String message,Person person);

    abstract void setRenter(Person renter);

    abstract void setLandlord(Person landlord);

}

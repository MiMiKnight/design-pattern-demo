package com.github.mimiknight.designpattern.type03.pattern06.case02;

/**
 * 房屋中介（中介实现类）
 */
public class HouseMediator extends Mediator {

    private Person renter;

    private Person landlord;

    @Override
    void send(String message, Person person) {
        if (person.equals(renter)) {
            landlord.getMessage(message);
            return;
        }
        if (person.equals(landlord)) {
            renter.getMessage(message);
        }
    }

    @Override
    void setRenter(Person renter) {
        this.renter = renter;
    }

    @Override
    void setLandlord(Person landlord) {
        this.landlord = landlord;
    }
}

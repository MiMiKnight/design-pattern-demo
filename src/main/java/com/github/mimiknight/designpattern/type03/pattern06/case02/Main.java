package com.github.mimiknight.designpattern.type03.pattern06.case02;

public class Main {
    public static void main(String[] args) {

        HouseMediator houseMediator = new HouseMediator();
        Renter renter = new Renter();
        Landlord landlord = new Landlord();

        houseMediator.setRenter(renter);
        houseMediator.setLandlord(landlord);

        renter.setMediator(houseMediator);
        landlord.setMediator(houseMediator);

        renter.setMessage("我想租套房子");
        landlord.setMessage("我想出租房子");

    }
}

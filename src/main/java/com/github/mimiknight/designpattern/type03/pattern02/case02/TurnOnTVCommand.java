package com.github.mimiknight.designpattern.type03.pattern02.case02;

public class TurnOnTVCommand implements Command {

    private TV tv;

    public TurnOnTVCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}

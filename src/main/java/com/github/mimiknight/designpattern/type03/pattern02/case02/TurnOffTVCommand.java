package com.github.mimiknight.designpattern.type03.pattern02.case02;

public class TurnOffTVCommand implements Command {

    private TV tv;

    public TurnOffTVCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}

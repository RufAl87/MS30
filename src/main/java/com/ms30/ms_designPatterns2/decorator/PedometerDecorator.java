package com.ms30.ms_designPatterns2.decorator;

public class PedometerDecorator extends SmartWatchDecorator{

    public PedometerDecorator(SmartWatch smartWatch) {

        super(smartWatch);
    }


    @Override
    public String addFunction() {

        return smartWatch.addFunction() + "+ встроенный шагомер";
    }

    @Override
    public int getPrice() {

        return smartWatch.getPrice() + 400;
    }
}

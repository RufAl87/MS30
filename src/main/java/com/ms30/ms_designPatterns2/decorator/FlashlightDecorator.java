package com.ms30.ms_designPatterns2.decorator;

public class FlashlightDecorator extends SmartWatchDecorator{

    public FlashlightDecorator(SmartWatch smartWatch) {

        super(smartWatch);
    }


    @Override
    public String addFunction() {

        return smartWatch.addFunction() + "+ встроенный фонарик";
    }

    @Override
    public int getPrice() {

        return smartWatch.getPrice() + 100;
    }
}

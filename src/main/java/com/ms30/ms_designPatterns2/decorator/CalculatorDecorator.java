package com.ms30.ms_designPatterns2.decorator;

public class CalculatorDecorator extends SmartWatchDecorator{

    public CalculatorDecorator(SmartWatch smartWatch) {
        super(smartWatch);
    }


    @Override
    public String addFunction() {
        return smartWatch.addFunction() + "+ встроенный калькулятор";
    }

    @Override
    public int getPrice() {
        return smartWatch.getPrice() + 250;
    }
}

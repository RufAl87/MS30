package com.ms30.ms_designPatterns2.decorator;

public class SimpleSmartWatch implements SmartWatch {
    @Override
    public String addFunction() {
        return "Показывает время";
    }

    @Override
    public int getPrice() {
        return 500;
    }
}

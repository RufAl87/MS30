package com.ms30.ms_designPatterns.abstractFactory.units;

public class HorseRider implements Rider {
    @Override
    public void ride() {
        System.out.println("Rider is riding Horse");
    }
}

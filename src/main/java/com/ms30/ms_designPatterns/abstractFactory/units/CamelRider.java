package com.ms30.ms_designPatterns.abstractFactory.units;

public class CamelRider implements Rider {
    @Override
    public void ride() {
        System.out.println("Rider is riding Camel");
    }
}

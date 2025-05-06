package com.ms30.ms_designPatterns.factoryMethod;

public class BarsaFanFactory implements SoccerFanFactory{
    @Override
    public SoccerFan createFan() {

        return new BarsaFan();
    }
}

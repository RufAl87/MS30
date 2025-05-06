package com.ms30.ms_designPatterns.factoryMethod;

public class RealFanFactory implements SoccerFanFactory{
    @Override
    public SoccerFan createFan() {
        return new RealFan();
    }
}

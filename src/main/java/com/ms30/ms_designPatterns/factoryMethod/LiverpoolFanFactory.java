package com.ms30.ms_designPatterns.factoryMethod;

public class LiverpoolFanFactory implements SoccerFanFactory{
    @Override
    public SoccerFan createFan() {

        return new LiverpoolFan();
    }
}

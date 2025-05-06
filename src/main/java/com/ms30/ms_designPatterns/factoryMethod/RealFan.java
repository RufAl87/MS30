package com.ms30.ms_designPatterns.factoryMethod;

public class RealFan  implements SoccerFan{
    @Override
    public void shoutSlogan() {
        System.out.println("I'm a RealFan, Hala Madrid");
    }
}

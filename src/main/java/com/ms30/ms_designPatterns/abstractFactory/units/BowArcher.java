package com.ms30.ms_designPatterns.abstractFactory.units;

public class BowArcher implements Archer {
    @Override
    public void shootArrows() {
        System.out.println("Archer is shooting by Bow");
    }
}

package com.ms30.ms_designPatterns.abstractFactory.units;

public class CrossBowArcher implements Archer {

    @Override
    public void shootArrows() {
        System.out.println("Archer is shooting by Cross Bow");
    }
}

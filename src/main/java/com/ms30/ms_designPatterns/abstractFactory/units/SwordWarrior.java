package com.ms30.ms_designPatterns.abstractFactory.units;

public class SwordWarrior implements Warrior {

    @Override
    public void chop() {
        System.out.println("Warrior is cutting by Sword");
    }
}

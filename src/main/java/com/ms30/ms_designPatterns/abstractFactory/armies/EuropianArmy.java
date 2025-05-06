package com.ms30.ms_designPatterns.abstractFactory.armies;

import com.ms30.ms_designPatterns.abstractFactory.units.*;

public class EuropianArmy implements ArmyFactory {
    @Override
    public Archer getArcher() {
        return new CrossBowArcher();
    }

    @Override
    public Rider getRider() {
        return new HorseRider();
    }

    @Override
    public Warrior getWarrior() {
        return new SwordWarrior();
    }
}

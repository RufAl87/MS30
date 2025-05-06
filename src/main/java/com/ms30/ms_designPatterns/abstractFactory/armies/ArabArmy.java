package com.ms30.ms_designPatterns.abstractFactory.armies;

import com.ms30.ms_designPatterns.abstractFactory.units.*;

public class ArabArmy implements ArmyFactory {
    @Override
    public Archer getArcher() {
        return new BowArcher();
    }

    @Override
    public Rider getRider() {
        return new CamelRider();
    }

    @Override
    public Warrior getWarrior() {
        return new SaberWarrior();
    }
}

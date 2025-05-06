package com.ms30.ms_designPatterns.abstractFactory.armies;

import com.ms30.ms_designPatterns.abstractFactory.units.Archer;
import com.ms30.ms_designPatterns.abstractFactory.units.Rider;
import com.ms30.ms_designPatterns.abstractFactory.units.Warrior;

public interface ArmyFactory {
    Archer getArcher();
    Rider getRider();
    Warrior getWarrior();
}

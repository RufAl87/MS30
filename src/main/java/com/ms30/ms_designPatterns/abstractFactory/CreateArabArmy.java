package com.ms30.ms_designPatterns.abstractFactory;

import com.ms30.ms_designPatterns.abstractFactory.armies.ArabArmy;
import com.ms30.ms_designPatterns.abstractFactory.armies.ArmyFactory;
import com.ms30.ms_designPatterns.abstractFactory.units.Archer;
import com.ms30.ms_designPatterns.abstractFactory.units.Rider;
import com.ms30.ms_designPatterns.abstractFactory.units.Warrior;

public class CreateArabArmy {
    public static void main(String[] args) {
        ArmyFactory armyFactory = new ArabArmy();
        Archer archer = armyFactory.getArcher();
        Rider rider = armyFactory.getRider();
        Warrior warrior = armyFactory.getWarrior();

        System.out.println("Create Army: ");
        archer.shootArrows();
        rider.ride();
        warrior.chop();
    }
}

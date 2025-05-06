package com.ms30.ms_designPatterns.abstractFactory;

import com.ms30.ms_designPatterns.abstractFactory.armies.ArmyFactory;
import com.ms30.ms_designPatterns.abstractFactory.armies.EuropianArmy;
import com.ms30.ms_designPatterns.abstractFactory.units.Archer;
import com.ms30.ms_designPatterns.abstractFactory.units.Rider;
import com.ms30.ms_designPatterns.abstractFactory.units.Warrior;

public class CreateEuropeArmy {
    public static void main(String[] args) {
        ArmyFactory armyFactory = new EuropianArmy();
        Archer archer2 = armyFactory.getArcher();
        Rider rider2 = armyFactory.getRider();
        Warrior warrior2 = armyFactory.getWarrior();

        System.out.println("Create Army: ");
        archer2.shootArrows();
        rider2.ride();
        warrior2.chop();
    }
}

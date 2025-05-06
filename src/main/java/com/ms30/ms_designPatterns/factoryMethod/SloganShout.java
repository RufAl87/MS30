package com.ms30.ms_designPatterns.factoryMethod;

public class SloganShout {
    public static void main(String[] args) {

        SoccerFanFactory soccerFanFactory = createFanByTeam("real");
        SoccerFan soccerFan = soccerFanFactory.createFan();

        soccerFan.shoutSlogan();
    }

    static  SoccerFanFactory createFanByTeam(String team) {
        if (team.equalsIgnoreCase("real")) {
            return new RealFanFactory();
        }
        else if (team.equalsIgnoreCase("barsa")) {
            return new BarsaFanFactory();
        }
        else if (team.equalsIgnoreCase("liverpool")) {
            return new LiverpoolFanFactory();
        }
        else {
            throw new  RuntimeException(team + " is not a such team and fan");
        }
    }
}

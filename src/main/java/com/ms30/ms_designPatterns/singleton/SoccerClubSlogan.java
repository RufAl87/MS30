package com.ms30.ms_designPatterns.singleton;

import java.util.HashMap;
import java.util.Map;

public class SoccerClubSlogan {
    private static final Map<Clubs, SoccerClubSlogan> clubs = new HashMap<>();

    private Clubs clubName;
    private String slogan;

    private SoccerClubSlogan(Clubs clubName) {
        this.clubName = clubName;
        if (clubName.equals(Clubs.REALMADRID)) slogan = "Hala Madrid";
        else if (clubName.equals(Clubs.BARCELONA)) slogan = "Visca el Barca y visca Catalunya";
        else if (clubName.equals(Clubs.MU)) slogan = "Glory Glory Man United";
        else if (clubName.equals(Clubs.LIVERPOOL)) slogan = "YNWA";
        else if (clubName.equals(Clubs.BAYERN)) slogan = "Mia san Mia";
        else slogan = "?";

        System.out.println("Создан девиз для футбольного клуба: " + clubName);
    }


    public static synchronized SoccerClubSlogan getInstance(Clubs clubName) {
        if (!clubs.containsKey(clubName)) {
            clubs.put(clubName, new SoccerClubSlogan(clubName));
        }
        return clubs.get(clubName);
    }

    public String getSlogan() {
        return slogan;
    }

    public Clubs getClubName() {
        return clubName;
    }

}

package com.ms30.ms_designPatterns.singleton;

public class SloganCall {
    public static void main(String[] args) {

        SoccerClubSlogan realmadrid = SoccerClubSlogan.getInstance(Clubs.REALMADRID);
        SoccerClubSlogan barcelona= SoccerClubSlogan.getInstance(Clubs.BARCELONA);
        SoccerClubSlogan liverpool = SoccerClubSlogan.getInstance(Clubs.LIVERPOOL);
        SoccerClubSlogan bayern = SoccerClubSlogan.getInstance(Clubs.BAYERN);
        SoccerClubSlogan mu = SoccerClubSlogan.getInstance(Clubs.MU);

        System.out.println(realmadrid.getSlogan());
        System.out.println(barcelona.getSlogan());
        System.out.println(liverpool.getSlogan());
        System.out.println(bayern.getSlogan());
        System.out.println(mu.getSlogan());
    }
        }


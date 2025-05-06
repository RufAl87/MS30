package com.ms30.ms_designPatterns.prototype;

public class SoccerPlayerCreator {
    public static void main(String[] args) {

        SoccerPlayer firstPlayer = new SoccerPlayer("Arda",  20, "Guler", "midfielder");

        System.out.println(firstPlayer);

        SoccerPlayerCopy firstCopy = new SoccerPlayerCopy(firstPlayer);
        SoccerPlayer firstPlayerCopy = firstCopy.cloneSoccerPlayer();

        System.out.println(firstPlayerCopy);
    }
}

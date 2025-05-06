package com.ms30.ms_designPatterns.prototype;

public class SoccerPlayerCopy {

    SoccerPlayer soccerPlayer;

    public SoccerPlayerCopy(SoccerPlayer soccerPlayer) {
        this.soccerPlayer = soccerPlayer;
    }

    public void setSoccerPlayer(SoccerPlayer soccerPlayer) {
        this.soccerPlayer = soccerPlayer;
    }
    SoccerPlayer cloneSoccerPlayer() {
       return  (SoccerPlayer) soccerPlayer.copy();
    }
}

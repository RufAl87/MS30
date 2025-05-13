package com.ms30.ms_designPatterns3.observer;

public class PlayStationGamersNotifier implements GamerNotifier {

    private String psUser;

    public PlayStationGamersNotifier(String psUser) {

        this.psUser = psUser;
    }
    @Override
    public void update(String event) {

        System.out.println("Для пользователей " + psUser + ": Новость получена - " + event);
    }
}

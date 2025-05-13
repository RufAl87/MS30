package com.ms30.ms_designPatterns3.observer;

public class PCGamersNotifier implements GamerNotifier {

    private String pcUser;

    public PCGamersNotifier(String pcUser) {

        this.pcUser = pcUser;
    }
    @Override
    public void update(String event) {

        System.out.println("Для пользователей " + pcUser + ": Новость получена - " + event);
    }
}

package com.ms30.ms_designPatterns3.observer;

public class XboxGamersNotifier implements GamerNotifier {

    private String xboxUser;

    public XboxGamersNotifier(String xboxUser) {
        this.xboxUser = xboxUser;
    }
    @Override
    public void update(String event) {

        System.out.println("Для пользователей " + xboxUser + ": Новость получена - " + event);
    }
}

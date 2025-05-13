package com.ms30.ms_designPatterns3.observer;

public class News {
    public static void main(String[] args) {
        RockStarGames agency = new RockStarGames();

        GamerNotifier xboxPlayer = new XboxGamersNotifier("Xbox");
        GamerNotifier pcPlayer = new PCGamersNotifier("PC");
        GamerNotifier psPlayer = new PlayStationGamersNotifier("PS");

        agency.subscribe(xboxPlayer);
        agency.subscribe(pcPlayer);
        agency.subscribe(psPlayer);

        agency.publishNews("GTA 6 выпущен!");
        System.out.println("================================================");
        agency.publishNews("GTA 6 появился онлайн сервис!");
        System.out.println("================================================");
        agency.unsubscribe(pcPlayer);

        agency.publishNews("Новый DLC появился!");
    }
}

package com.ms30.ms_designPatterns3.strategy;

public class GameStore {
    public static void main(String[] args) {

        GamesBuying gamesBuying = new GamesBuying();

        gamesBuying.setGameBuy(new XboxAccount("Xbox account"));
        gamesBuying.buyingProcess("GTA 6", 200);

        gamesBuying.setGameBuy(new SteamAccount("Steam profile"));
        gamesBuying.buyingProcess("Need for Speed 3", 30);

        gamesBuying.setGameBuy(new PlaystationAccount("PS user"));
        gamesBuying.buyingProcess("Last of us 2", 75);


    }
}

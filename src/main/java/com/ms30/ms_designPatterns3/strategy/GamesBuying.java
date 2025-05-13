package com.ms30.ms_designPatterns3.strategy;

public class GamesBuying {
    private GameBuy gameBuy;


    public void setGameBuy(GameBuy gameBuy) {
        this.gameBuy = gameBuy;
    }

    public void buyingProcess(String game, int amount){

        gameBuy.buy(game, amount);

    }
}

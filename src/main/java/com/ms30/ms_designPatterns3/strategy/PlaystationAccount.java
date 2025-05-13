package com.ms30.ms_designPatterns3.strategy;

public class PlaystationAccount implements GameBuy{
    private String userPS;

    public PlaystationAccount(String userPS) {
        this.userPS = userPS;

    }

    @Override
    public void buy(String game, int amount) {

        System.out.println("Покупка " + game + " за " + amount + " через PS аккаунт: " + userPS);
    }
}

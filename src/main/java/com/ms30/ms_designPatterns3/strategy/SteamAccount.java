package com.ms30.ms_designPatterns3.strategy;

public class SteamAccount implements GameBuy{
    private String profile;

    public SteamAccount(String profile) {

        this.profile = profile;
    }

    @Override
    public void buy(String game, int amount) {

        System.out.println("Покупка " + game + " за " + amount + " через Steam аккаунт: " + profile);
    }
}

package com.ms30.ms_designPatterns3.strategy;

public class XboxAccount implements GameBuy{
    private String account;

    public XboxAccount(String account) {
        this.account = account;
    }

    @Override
    public void buy(String game, int amount) {

        System.out.println("Покупка " + game + " за " + amount + " через Xbox аккаунт: " + account);
    }
}

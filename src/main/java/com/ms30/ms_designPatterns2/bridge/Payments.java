package com.ms30.ms_designPatterns2.bridge;

public abstract class Payments {
    public Currency currency;

    public Payments(Currency currency) {
        this.currency = currency;
    }

    public abstract void paymentMethod(String message);
}

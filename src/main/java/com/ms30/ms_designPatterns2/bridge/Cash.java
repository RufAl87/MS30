package com.ms30.ms_designPatterns2.bridge;

public class Cash extends Payments {

    public Cash(Currency currency) {
        super(currency);
    }

    @Override
    public void paymentMethod(String message) {
        currency.paidBy("используем наличные " + message);
    }
}

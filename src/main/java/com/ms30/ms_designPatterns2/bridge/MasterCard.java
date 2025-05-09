package com.ms30.ms_designPatterns2.bridge;

public class MasterCard extends Payments{
    public MasterCard(Currency currency) {
        super(currency);
    }

    @Override
    public void paymentMethod(String message) {
        currency.paidBy("используем Master Card " + message);
    }
}

package com.ms30.ms_designPatterns2.bridge;


public class VisaCard extends Payments
{
    public VisaCard(Currency currency) {
        super(currency);
    }

    @Override
    public void paymentMethod(String message) {
        currency.paidBy("используем Visa Card " + message);
    }
}

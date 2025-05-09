package com.ms30.ms_designPatterns2.bridge;

public class ManatCurrency implements Currency {
    @Override
    public void paidBy(String message) {
        System.out.println("Оплачено в манатах, " + message);
    }
}

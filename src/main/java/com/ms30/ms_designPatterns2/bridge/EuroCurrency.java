package com.ms30.ms_designPatterns2.bridge;

public class EuroCurrency implements Currency {
    @Override
    public void paidBy(String mesaage) {
        System.out.println("Оплачено в евро, " + mesaage);
    }
}

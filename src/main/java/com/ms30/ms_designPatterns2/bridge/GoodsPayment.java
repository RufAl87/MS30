package com.ms30.ms_designPatterns2.bridge;

public class GoodsPayment {
    public static void main(String[] args) {

        Payments payment1 = new Cash(new DollarCurrency());
        Payments payment2 = new VisaCard(new EuroCurrency());
        Payments payment3 = new MasterCard(new ManatCurrency());
        payment1.paymentMethod("для покупки золота");
        payment2.paymentMethod("для покупки телефона");
        payment3.paymentMethod("для покупки сувенира");
    }
}

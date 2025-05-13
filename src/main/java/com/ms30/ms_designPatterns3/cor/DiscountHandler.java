package com.ms30.ms_designPatterns3.cor;

public class DiscountHandler extends GameHandler{

    @Override
    protected boolean check(User user, PriceContext ctx) {
        if (user.hasDiscount) {
            double discount = ctx.currentPrice * 0.2;
            ctx.currentPrice -= discount;
            System.out.printf("Применена скидка 20%% (−%.2f). Новая цена: %.2f%n", discount, ctx.currentPrice);
        } else {
            System.out.println("Скидка отсутствует.");
        }
        return true;
    }
}

package com.ms30.ms_designPatterns3.cor;

public class BalanceHandler extends GameHandler{
    @Override
    protected boolean check(User user, PriceContext ctx) {
        if (user.balance < ctx.currentPrice) {
            System.out.printf("Недостаточно денег на балансе. Нужно %.2f, есть %.2f%n", ctx.currentPrice, user.balance);
            return false;
        }
        System.out.printf("Покупка совершена. Списание: %.2f%n", ctx.currentPrice);
        return true;
    }
}

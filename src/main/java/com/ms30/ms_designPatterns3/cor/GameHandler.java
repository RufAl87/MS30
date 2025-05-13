package com.ms30.ms_designPatterns3.cor;

public abstract class GameHandler {
    private GameHandler next;

    public GameHandler setNext(GameHandler next) {
        this.next = next;
        return next;
    }

    public void handle(User user, PriceContext priceContext) {
        if (!check(user, priceContext)) return;

        if (next != null) {
            next.handle(user, priceContext);
        } else {
            System.out.printf("Покупка завершена! Итоговая сумма: %.2f%n", priceContext.currentPrice);
        }
    }

    protected abstract boolean check(User user, PriceContext priceContext);
}

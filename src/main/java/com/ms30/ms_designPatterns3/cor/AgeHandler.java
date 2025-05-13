package com.ms30.ms_designPatterns3.cor;

public class AgeHandler extends GameHandler{
    @Override
    protected boolean check(User user, PriceContext ctx) {
        if (user.age < 18) {
            System.out.println("Отказ: Пользователю должно быть совершенолетним.");
            return false;
        }
        System.out.println("Возраст проверен: 18+");
        return true;
    }
}

package com.ms30.ms_designPatterns3.cor;

public class User {
    String name;
    int age;
    double balance;
    boolean hasDiscount;

    public User(String name, int age, double balance, boolean hasDiscount) {
        this.name = name;
        this.age = age;
        this.balance = balance;
        this.hasDiscount = hasDiscount;
    }
}

class PriceContext {
    double originalPrice;
    double currentPrice;

    public PriceContext(double price) {
        this.originalPrice = price;
        this.currentPrice = price;
    }
}

package com.ms30.ms_designPatterns3.cor;

public class GameBuyByUser {
    public static void main(String[] args) {

        double gamePrice = 50.00;

        User user1 = new User("Mike", 20, 60.00, true);
        User user2 = new User("Bob", 16, 100.00, true);
        User user3 = new User("Helen", 27, 30.00, false);
        User user4 = new User("Steve", 30, 40.00, true);

        GameHandler chain = new AgeHandler();
        chain.setNext(new DiscountHandler())
                .setNext(new BalanceHandler());

        System.out.println("User1:");
        chain.handle(user1, new PriceContext(gamePrice));

        System.out.println("\nUser2:");
        chain.handle(user2, new PriceContext(gamePrice));

        System.out.println("\nUser3:");
        chain.handle(user3, new PriceContext(gamePrice));

        System.out.println("\nUser4:");
        chain.handle(user4, new PriceContext(gamePrice));




    }
}

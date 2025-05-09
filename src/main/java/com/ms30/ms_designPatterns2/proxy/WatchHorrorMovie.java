package com.ms30.ms_designPatterns2.proxy;

public class WatchHorrorMovie {
    public static void main(String[] args) {

        HorrorMoviesHub childService = new ProxyHorrorMovies(16);
        System.out.println(childService.getMovie("От заката до рассвета"));

        System.out.println("==============================================");

        HorrorMoviesHub adultService = new ProxyHorrorMovies(25);
        System.out.println(adultService.getMovie("Сияние"));

        System.out.println("==============================================");

        System.out.println(adultService.getMovie("Сияние"));

        System.out.println("==============================================");

        System.out.println(adultService.getMovie("Молчание ягнят"));
    }
}

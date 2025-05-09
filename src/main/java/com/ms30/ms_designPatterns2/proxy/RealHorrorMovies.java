package com.ms30.ms_designPatterns2.proxy;

public class RealHorrorMovies implements HorrorMoviesHub{
    @Override
    public String getMovie(String movieName) {
        System.out.println("Загружаем фильм " + movieName + " с сайта");
        return "Фильм " + movieName + " загружен!";
    }
}

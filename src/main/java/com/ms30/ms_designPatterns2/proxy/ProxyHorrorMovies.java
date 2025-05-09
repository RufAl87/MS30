package com.ms30.ms_designPatterns2.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyHorrorMovies implements HorrorMoviesHub {
    private RealHorrorMovies realService;
    private int userAge;
    private Map<String, String> cache = new HashMap<>();

    public ProxyHorrorMovies(int userAge) {
        this.userAge = userAge;
    }

    private void checkAge() throws AccessDeniedException {
        if (userAge < 18) {
            throw new AccessDeniedException("Доступ запрещён: вы несовершеннолетний");
        }
    }

    @Override
    public String getMovie(String movieName) {
        try {
            checkAge();

            if (cache.containsKey(movieName)) {
                System.out.println("Фильм " + movieName + " уже загружен ранее");
                return cache.get(movieName);
            }

            if (realService == null) {
                realService = new RealHorrorMovies();
            }

            String content = realService.getMovie(movieName);
            cache.put(movieName, content);
            return content;

        } catch (AccessDeniedException e) {
            return "Ошибка: " + e.getMessage();
        }
    }

    class AccessDeniedException extends Exception {
        public AccessDeniedException(String message) {
            super(message);
        }
    }
}

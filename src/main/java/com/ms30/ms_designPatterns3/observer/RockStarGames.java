package com.ms30.ms_designPatterns3.observer;

import java.util.ArrayList;
import java.util.List;

public class RockStarGames implements Game {
    private List<GamerNotifier> gamerNotifiers = new ArrayList<>();

    @Override
    public void subscribe(GamerNotifier o) {
        gamerNotifiers.add(o);

    }

    @Override
    public void unsubscribe(GamerNotifier o) {
        gamerNotifiers.remove(o);

    }

    @Override
    public void notifyObservers(String news) {
        for (GamerNotifier o : gamerNotifiers) {
            o.update(news);
        }

    }

    public void publishNews(String news) {
        System.out.println("RockStar публикует: " + news);
        notifyObservers(news);
    }
}

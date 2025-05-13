package com.ms30.ms_designPatterns3.observer;

public interface Game {
    void subscribe(GamerNotifier o);
    void unsubscribe(GamerNotifier o);
    void notifyObservers(String news);
}

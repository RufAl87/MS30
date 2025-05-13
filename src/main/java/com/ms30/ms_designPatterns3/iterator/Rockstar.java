package com.ms30.ms_designPatterns3.iterator;

import java.util.ArrayList;
import java.util.List;

public class Rockstar {
    private List<Game> games = new ArrayList<>();

    public void addGame(String name) {
        games.add(new Game(name));
    }

    public GameIterator getIterator() {
        return new RockstarIterator(games);
    }

    private static class RockstarIterator implements GameIterator {
        private List<Game> games;
        private int index = 0;

        public RockstarIterator(List<Game> games) {
            this.games = games;
        }

        public boolean hasNext() {
            return index < games.size();
        }

        public Game next() {
            return games.get(index++);
        }
    }
}

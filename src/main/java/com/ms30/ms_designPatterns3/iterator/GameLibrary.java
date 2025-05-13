package com.ms30.ms_designPatterns3.iterator;

public class GameLibrary {
    public static void printGames(String publisherName, GameIterator iterator) {
        System.out.println(publisherName + " games:");
        while (iterator.hasNext()) {
            System.out.println(" - " + iterator.next());
        }
        System.out.println();
    }
}

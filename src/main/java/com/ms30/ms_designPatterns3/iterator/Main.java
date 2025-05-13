package com.ms30.ms_designPatterns3.iterator;

public class Main {
    public static void main(String[] args) {

        Rockstar rockstarGames = new Rockstar();
        rockstarGames.addGame("GTA 6");
        rockstarGames.addGame("Max Payne");
        rockstarGames.addGame("Manhunt");
        rockstarGames.addGame("RDR 2");

        ElectronicsArts electronicsArtsGames = new ElectronicsArts();
        electronicsArtsGames.addGame("Battlefield 2");
        electronicsArtsGames.addGame("Dragon Age");
        electronicsArtsGames.addGame("FIFA");
        electronicsArtsGames.addGame("Need for Speed 5");


        GameLibrary.printGames("RockStar", rockstarGames.getIterator());
        GameLibrary.printGames("EA", electronicsArtsGames.getIterator());

    }
}

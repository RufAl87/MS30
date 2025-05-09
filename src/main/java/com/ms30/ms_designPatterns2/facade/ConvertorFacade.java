package com.ms30.ms_designPatterns2.facade;

public class ConvertorFacade {
    private PoundConvertor poundConvertor;
    private KiloConvertor kiloConvertor;

    public ConvertorFacade() {
        this.poundConvertor = new PoundConvertor();
        this.kiloConvertor = new KiloConvertor();
    }

    public double convertToGrams(double pounds) {
        double kilos = poundConvertor.poundsToKilograms(pounds);
        return kiloConvertor.kilogramsToGrams(kilos);
    }
}

package com.ms30.ms_designPatterns2.adapter;

public class AdapterFootToMeter implements MetricMeasurement{

    private final FootMeasurement footMeasurement;

    public AdapterFootToMeter(FootMeasurement footMeasurement) {
        this.footMeasurement = footMeasurement;
    }

    @Override
    public double getLengthInMeters() {
        double feet = footMeasurement.getLengthInFeet();
        return feet * 0.3048;
    }
}

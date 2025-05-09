package com.ms30.ms_designPatterns2.adapter;

public class Converter {
    public static void main(String[] args) {
        FootMeasurement footMeasurement = new FootMeasurement();

        MetricMeasurement metricMeasurement = new AdapterFootToMeter(footMeasurement);

        System.out.println(" Длина в метрах: " + metricMeasurement.getLengthInMeters());
    }
}

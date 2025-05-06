package com.ms30.ms_designPatterns.builder;

public class CarCreator {
    public static void main(String[] args) {

        Car bmw = new Car.Builder("ElectricEngine")
                .display("Sony")
                .navigation("GPS")
                .plugIn("FastCharge")
                .seats(2)
                .doors(2)
                .build();

        Car juquli = new Car.Builder("GasolineEngine")
                .radio("FM-AM")
                .seats(5)
                .doors(4)
                .build();


        System.out.println(bmw);
        System.out.println(juquli);
    }
    }


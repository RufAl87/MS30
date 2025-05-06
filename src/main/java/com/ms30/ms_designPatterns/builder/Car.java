package com.ms30.ms_designPatterns.builder;

public class Car {
    private final String engine;
    private final String display;
    private final String navigation;
    private final String radio;
    private final String plugIn;
    private final int seats;
    private final int doors;


    private Car(Builder builder) {
        this.engine = builder.engine;
        this.display = builder.display;
        this.navigation = builder.navigation;
        this.radio = builder.radio;
        this.plugIn = builder.plugIn;
        this.seats = builder.seats;
        this.doors = builder.doors;
    }

    public static class Builder {
        private final String engine;
        private  String display;
        private  String navigation;
        private  String radio;
        private  String plugIn;
        private  int seats;
        private  int doors;


        public Builder(String engine) {
            this.engine = engine;
        }

        public Builder display(String display) {
            this.display = display;
            return this;
        }

        public Builder navigation(String navigation) {
            this.navigation = navigation;
            return this;
        }

        public Builder radio(String radio) {
            this.radio = radio;
            return this;
        }

        public Builder plugIn(String plugIn) {
            this.plugIn = plugIn;
            return this;
        }

        public Builder seats(int seats) {
            this.seats = seats;
            return this;
        }

        public Builder doors(int doors) {
            this.doors = doors;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", display='" + display + '\'' +
                ", navigation='" + navigation + '\'' +
                ", radio='" + radio + '\'' +
                ", plugIn='" + plugIn + '\'' +
                ", seats=" + seats +
                ", doors=" + doors +
                '}';
    }
}

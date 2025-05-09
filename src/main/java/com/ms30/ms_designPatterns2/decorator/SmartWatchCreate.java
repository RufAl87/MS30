package com.ms30.ms_designPatterns2.decorator;

public class SmartWatchCreate {
    public static void main(String[] args) {
        SmartWatch simpleSmartWatch = new SimpleSmartWatch();

        SmartWatch mySmartWatch = new SimpleSmartWatch();
        mySmartWatch = new CalculatorDecorator(mySmartWatch);
        mySmartWatch = new PedometerDecorator(mySmartWatch);
        mySmartWatch = new FlashlightDecorator(mySmartWatch);

        System.out.println("Простой SmartWatch " + simpleSmartWatch.addFunction() + " и его цена " + simpleSmartWatch.getPrice());
        System.out.println("==========================================================");
        System.out.println("Мой SmartWatch " + mySmartWatch.addFunction() + " и его цена " + mySmartWatch.getPrice());
    }
}

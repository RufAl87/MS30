package com.ms30.ms_designPatterns2.adapter;
import java.util.Scanner;

public class FootMeasurement {

    public double getLengthInFeet() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество футов: ");
        return scanner.nextDouble();
    }
}


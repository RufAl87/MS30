package com.ms30.ms_designPatterns2.facade;

import java.util.Scanner;

public class PoundToGramResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите вес в фунтах:   ");
        double pounds = scanner.nextDouble();

        ConvertorFacade converter = new ConvertorFacade();
        double grams = converter.convertToGrams(pounds);

        System.out.printf(pounds + " фунтов = " + grams + " граммов");

        scanner.close();
    }
}

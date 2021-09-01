package com.sg.basicprogrammingconceptsassessment;

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        int maximumHeartRate = 220 - age;
        double lowerBound = maximumHeartRate * .5;
        double upperBound = maximumHeartRate * .85;
        
        System.out.println("Your maximum heart rate should be " +  maximumHeartRate + " beats per minute");
        System.out.println("Your target HR Zone is " + lowerBound + " - " + upperBound + " beats per minute");
    }
}

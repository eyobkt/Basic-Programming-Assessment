package com.sg.basicprogrammingconceptsassessment;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your dog's name?");
        String name = scanner.nextLine();
        
        System.out.println("Well then, I have this highly reliable report on " + name + "'s prestigious background right here.");
        System.out.println();
        System.out.println(name + " is:");
        System.out.println();
        
        String[] breeds = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Golden Retriever", "King Doberman"};
        int remainingPercentage = 100;
        
        Random random = new Random();
        
        for (int i = 0; i < breeds.length - 1; i++) {
            int percentage = random.nextInt(remainingPercentage + 1);
            System.out.println(percentage + "% " + breeds[i]);
            remainingPercentage -= percentage;
        }
        
        System.out.println(remainingPercentage + "% " + breeds[4]);        
        System.out.println();
        System.out.println("Wow, that's QUITE the dog!");
    }
}

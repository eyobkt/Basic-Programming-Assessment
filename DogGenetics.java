package com.sg.basicprogrammingconceptsassessment;

import java.util.Random;
import java.util.Scanner;

/**
 * A console-based program that generates a fake DNA background report for a pet dog 
 */
public class DogGenetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your dog's name?");
        String name = scanner.nextLine();
        
        System.out.println("Well then, I have this highly reliable report on " + name + "'s prestigious background right here.");
        System.out.println();
        System.out.println(name + " is:");
        System.out.println();
        
        String[] breeds = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Golden Retriever", "King Doberman", 
                "Labrador Retriever", "Beagle", "Poodle", "Greyhound", "Shiba Inu"};
        int remainingPercentage = 100;        
        Random random = new Random();
        
        for (int i = 0; i < 4; i++) {
            // Select a breed from the portion of the breeds array containing breeds that haven't been selected yet
            int randomIndex = i + random.nextInt(breeds.length - i);
            String selectedBreed = breeds[randomIndex];            
            
            int percentage = random.nextInt(remainingPercentage + 1);
            System.out.println(percentage + "% " + selectedBreed);
            remainingPercentage -= percentage;
            
            // Swap the selected breed with the breed at the current value of i
            String temp = breeds[i];
            breeds[i] = selectedBreed;
            breeds[randomIndex] = temp;
        }
        
        int randomIndex = 4 + random.nextInt(breeds.length - 4);
        String selectedBreed = breeds[randomIndex];  
        
        System.out.println(remainingPercentage + "% " + selectedBreed);        
        System.out.println();
        System.out.println("Wow, that's QUITE the dog!");
    }
}

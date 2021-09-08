package com.sg.basicprogrammingconceptsassessment;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * A command-line game of Rock, Paper, Scissors played against the computer 
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {            
            System.out.println("How many rounds would you like to play?");
            int numRounds = scanner.nextInt();
        
            if (numRounds > 10 || numRounds < 1) {
                System.out.println("The number of rounds must be between 1 and 10");
                System.exit(0);
            }
            
            int numRoundsWon = 0;
            int numRoundsComputerWon = 0;
            int numRoundsTied = 0;
        
            for (int i = 0; i < numRounds; i++) {
                System.out.println("Round " + (i + 1));
                
                int selection = 0;
                     
                // Repeatedly ask the user for an int that's 1, 2, or 3, until they do so
                while (true) {
                    System.out.println("Enter 1 for Rock, 2 for Paper, or 3 for Scissors");
                    
                    try {
                        selection = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        scanner.nextLine();
                        continue;
                    }
                    
                    if (selection >= 1 && selection <= 3) {
                        break;
                    }
                }

                int computerSelection = 1 + random.nextInt(3);
                 
                if (selection == computerSelection) {
                    System.out.println("Tie");
                    numRoundsTied++;
                } else if (selection == computerSelection + 1 || selection == 1 && computerSelection == 3) {
                    System.out.println("You won");
                    numRoundsWon++;
                } else if (computerSelection == selection + 1 || computerSelection == 1 && selection == 3) {
                    System.out.println("Computer won");
                    numRoundsComputerWon++;
                }                               
            }
            
            System.out.println("You won " + numRoundsWon + " rounds");
            System.out.println("Computer won " + numRoundsComputerWon + " rounds");
            System.out.println("There were " + numRoundsTied + " ties");
            
            if (numRoundsWon < numRoundsComputerWon) {
                System.out.println("Computer won the game");
            } else if (numRoundsWon > numRoundsComputerWon) {
                System.out.println("You won the game");
            } else {
                System.out.println("The game is a tie");
            }
            
            scanner.nextLine();
            System.out.println("Would you like to play another game?");
            String yesOrNo = scanner.nextLine();
            
            if (yesOrNo.equalsIgnoreCase("No")) {
                System.out.println("Thanks for playing!");
                System.exit(0);
            }            
        }        
    }
}

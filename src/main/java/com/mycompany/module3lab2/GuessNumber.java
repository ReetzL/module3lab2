/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.module3lab2;
import java.util.Scanner;
import java.util.Random;


/**
 *
 * @author behlt
 */
public class GuessNumber {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        
        while (playAgain) {
            int numberToGuess = random.nextInt(1000) + 1;
            boolean guessedCorrectly = false;
            
            System.out.println("Guess a number between 1 and 1000:");
            
            while (!guessedCorrectly) {
                int guess = user.nextInt();
                
                if (guess == numberToGuess) {
                    System.out.println("Congratulations. You guessed the number!");
                    guessedCorrectly = true;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }
            
            System.out.println("Do you want to play again? (y/n)");
            String playAgainInput = user.next();
            
            if (!playAgainInput.equalsIgnoreCase("y")) {
                playAgain = false;
            }
        }
    }
}

    


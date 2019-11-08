package de.hdm.mi.sd1;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by TG on 08.11.19.
 */
public class Task3_WhileGuessNumber {
    public static void main(String[] args) {
        // We know System.out already, System.in allows us to read from user
        Scanner scanner = new Scanner(System.in);

        // Instantiate Random class and get random int from 0 to 99
        Random randGen = new Random();
        int randomNumber = randGen.nextInt(100);

        System.out.println("Guess the number between 0 and 99");
        int guess = scanner.nextInt();
        int guesses = 0;

        // loop until the guess is equal to the randomNumber
        while (guess != randomNumber) {
            if (guess > randomNumber) {
                System.out.println("You're guess is too high.");
            }

            if (guess < randomNumber) {
                System.out.println("You're guess is too low.");
            }

            // increment the number of guesses and get new guess from user
            guesses = guesses + 1;
            guess = scanner.nextInt();
        }

        System.out.println("You're right, the right number was " + randomNumber);
        System.out.println("It took you " + guesses + " tries to figure it out");
    }
}

package de.hdm.mi.sd1;

import java.util.Random;
import java.util.Scanner;

/**
 * Application that runs several programs written for SD1.
 * This is the working project, please refer to the different Tasks.
 */

public class App {
    private final static Scanner SC = new Scanner(System.in);
    private final static String WRONG_SELECTION = "Number not available, please select one of the available numbers.";

    /**
     * Your application's main entry point.
     *
     * @param args Yet unused3
     */
    public static void main(String[] args) {
        // Create a new Scanner object with the basic system input as channel

        printIntro();
        int selection = SC.nextInt();

        handleSelection(selection);
        System.out.println("Program exiting...");
    }


    private static void handleSelection (int selection) {
        switch (selection) {
            // Return bigger number of 2 given numbers (Relational Operators)
            case 1:
                comapreTwoNumbers();
                break;

            // Print every n-th number until 100 (For-Loop)
            case 2:
                printNthNumbers();
                break;

            // Guess the number (Random & While-Loop)
            case 3:
                guessTheNumber();
                break;

            // Read n numbers and apply print, sum, or average on them
            case 4:
                workWithArray();
                break;

            // Print christmas tree of given height
            case 5:
                printChristmasTree();
                break;

            // default use case catches values that are not specified
            default:
                System.out.println(WRONG_SELECTION);
        }
    }


    private static void comapreTwoNumbers() {
        System.out.println("Compare two numbers!");

        // Read in first number (as text) and convert it to int
        System.out.print("First Number: ");
        int firstNum = SC.nextInt();

        System.out.print("Second Number: ");
        int secondNum = SC.nextInt();

        // Ternary Operator = condition ? if true return : if false return
        int bigger = firstNum > secondNum ? firstNum : secondNum;

        System.out.println("The bigger number is: " + bigger);
    }


    private static void printNthNumbers() {
        System.out.println("Which n-th numbers to you want to print (e.g. ever 2nd)");
        int nth = SC.nextInt();
        int untilValue = 100;
        int numOfValues = 0;

        // loop from 1 to 100
        for (int i = 1; i <= untilValue; i++) {

            // modulo operator checks non-remainder divisibility, if result 0 => divisible
            if (i % nth == 0) {
                System.out.println(i);

                // short hand incrementing of number of values
                numOfValues++;
            }
        }

        System.out.println("Number of n-th values for n=" + nth + " is " + numOfValues);
    }


    private static void guessTheNumber() {
        // Instantiate Random class and get random int from 0 to 99
        Random randGen = new Random();
        int randomNumber = randGen.nextInt(100);

        System.out.println("Guess the number between 0 and 99");
        int guess = SC.nextInt();
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
            guess = SC.nextInt();
        }

        System.out.println("You're right, the right number was " + randomNumber);
        System.out.println("It took you " + guesses + " tries to figure it out");
    }


    private static void workWithArray () {
        System.out.println("How large do you want your array to be?");

        // read number from user and create int array of given size
        int arrSize = SC.nextInt();
        int[] numbers = new int[arrSize];

        // fill the array with the input of the user
        for (int i = 0; i < arrSize; i++) {
            System.out.println("Please enter the " + (i + 1) + ". number");
            int currNum = SC.nextInt();

            numbers[i] = currNum;
        }

        System.out.println();
        System.out.println("Please define what you want to do with the numbers now: (Enter one of the numbers)");
        System.out.println("1. Print all numbers");
        System.out.println("2. Sum up all numbers");
        System.out.println("3. Average all numbers");

        int selection = SC.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Printing all numbers");

                // method for simple printing of all the numbers in the int array
                printArrayNumbers(numbers);
                break;

            case 2:
                System.out.println("Printing sum of all numbers");

                // method that sums up all the values of the int array
                int sum = sumArrayNumbers(numbers);
                System.out.println(sum);
                break;

            case 3:
                System.out.println("Printing average of all numbers");

                // method that averages the numbers of the int array
                float avgNum = averageArrayNumbers(numbers);
                System.out.println(avgNum);
                break;

            default:
                // Simple constant variable defined at the beginning of class
                System.out.println(WRONG_SELECTION);
        }
    }


    private static void printChristmasTree () {
        System.out.println("How tall do you want your tree to be?");
        int treeSize = SC.nextInt();

        // Print star on the tree
        for (int i = 0; i < treeSize - 1; i++) {
            System.out.print(" ");
        }
        System.out.print("@");

        // print each line, starting from the top of the tree
        for (int i = (treeSize * 2); i >= 0 ; i -= 2) {

            // spaces before the tree starts
            for (int j = 0; j < i / 2; j++) {
                System.out.print(" ");
            }

            // print the actual tree line
            for (int j = 1; j < (treeSize * 2 - i); j++) {
                System.out.print("*");
            }

            // start a new line like in a type writer (we only use print without new line in the calls)
            System.out.println();
        }

        // Print the stem of the tree
        for (int i = 0; i < treeSize / 3; i++) {
            for (int j = 0; j < treeSize - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("▓");
        }

        System.out.println();
    }


    private static void printArrayNumbers (int[] numbers) {
        // for each loop, in each iteration i takes the next number of the array
        for (int i : numbers) {
            System.out.println(i);
        }
    }


    private static int sumArrayNumbers (int[] numbers) {
        int sum = 0;

        // simply adding each number to the sum
        for (int i : numbers) {
            sum += i;
        }

        return sum;
    }


    // Re-using the sumArrayNumbers method to calculate Average
    private static float averageArrayNumbers (int[] numbers) {

        // casting the length of the array to a float (floating comma number)
        // this makes e.g. 6.0 out of 6 and is needed for actual division
        return sumArrayNumbers(numbers) / (float) numbers.length;
    }


    private static void printIntro () {
        System.out.println("==========================");
        System.out.println("=== SE1 Program runner ===");
        System.out.println("==========================");
        System.out.println();
        System.out.println("Please select which program you want to run:");
        System.out.println("1 - Return bigger number of 2 given numbers (Relational Operators)");
        System.out.println("2 - Print every n-th number until 100 (For-Loop)");
        System.out.println("3 - Guess the number (Random & While-Loop)");
        System.out.println("4 - Create array and apply mathematic operation");
        System.out.println("5 - Print christmas tree of given height");
        System.out.println("6 - Todo...");
    }
}














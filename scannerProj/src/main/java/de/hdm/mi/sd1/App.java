package de.hdm.mi.sd1;

import de.hdm.mi.sd1.Task9_CoordinateSystemClasses.Task9_CoordinateSystemApp;

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

        switch (selection) {
            // Return bigger number of 2 given numbers (Relational Operators)
            case 1:
                Task1_ScannerCompare.main(args);
                break;

            // Print every n-th number until 100 (For-Loop)
            case 2:
                Task2_LoopsPrintNth.main(args);
                break;

            // Guess the number (Random & While-Loop)
            case 3:
                Task3_WhileGuessNumber.main(args);
                break;

            // Create array and apply mathematic operation
            case 4:
                Task5_ArrayMath.main(args);
                break;

            // Print christmas tree of given height
            case 5:
                Task7_ChristmasTree.main(args);
                break;

            // Create a Task9_CoordinateSystem and fill it with CoordinatePoints with a given value
            case 6:
                Task9_CoordinateSystemApp.main(args);
                break;

            // default use case catches values that are not specified
            default:
                System.out.println(WRONG_SELECTION);
        }

        System.out.println("Program exiting...");
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
        System.out.println("6 - Create a Task9_CoordinateSystem and fill it with CoordinatePoints with a given value");
        System.out.println("7 - ... TODO");
    }
}














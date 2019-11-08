package de.hdm.mi.sd1;

import java.util.Scanner;

/**
 * Created by TG on 08.11.19.
 */
public class Task4_SwitchCaseBuildBox {
    public static void main(String[] args) {
        // We know System.out already, System.in allows us to read from user
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================");
        System.out.println("=== SE1 Program runner ===");
        System.out.println("==========================");
        System.out.println();
        System.out.println("Please select which program you want to run:");
        System.out.println("1 - Return bigger number of 2 given numbers (Relational Operators)");
        System.out.println("2 - Print every n-th number until 100 (For-Loop)");
        System.out.println("3 - Guess the number (Random & While-Loop)");

        int selection = scanner.nextInt();

        /*
            We already know if-conditions, Switch-Case is a nicer way
            to write checks for multiple values

            The following switch case can be compared to:

            if (selection == 1) {
                ...
            } else if (selection == 2) {
                ...
            } else if (selection == 3) {
                ...
            } else {
                ...
            }
        */

        // check which number the user passed
        switch (selection) {

            // Return bigger number of 2 given numbers (Relational Operators)
            case 1:
                System.out.println("Compare two numbers!");

                // breaks are essential since other cases downwards will be executed without it until it hits a break
                //without break statement, e.g. case 2 will also be executed until its break statment
                break;

            // Print every n-th number until 100 (For-Loop)
            case 2:
                System.out.println("Which n-th numbers to you want to print (e.g. ever 2nd)");
                break;

            // Guess the number (Random & While-Loop)
            case 3:
                System.out.println("Guess the number between 0 and 99");
                break;

            // default use case catches values that are not specified
            default:
                System.out.println("Number not available, please select one of the available numbers.");

                // break not necessary here
                break;
        }
    }
}

package de.hdm.mi.sd1;

import java.util.Scanner;

/**
 * Created by TG on 08.11.19.
 */
public class Task1_ScannerCompare {
    public static void main(String[] args) {

        // We know System.out already, System.in allows us to read from user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Compare two numbers!");

        // Read in first number (as text) and convert it to int
        System.out.print("First Number: ");
        int firstNum = scanner.nextInt();

        System.out.print("Second Number: ");
        int secondNum = scanner.nextInt();

        // Ternary Operator = condition ? if true return : if false return
        int bigger = firstNum > secondNum ? firstNum : secondNum;

        System.out.println("The bigger number is: " + bigger);
    }
}

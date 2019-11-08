package de.hdm.mi.sd1;

import java.util.Scanner;

/**
 * Created by TG on 08.11.19.
 */
public class Task2_LoopsPrintNth {
    public static void main(String[] args) {
        // We know System.out already, System.in allows us to read from user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which n-th numbers to you want to print (e.g. ever 2nd)");
        int nth = scanner.nextInt();
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
}

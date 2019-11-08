package de.hdm.mi.sd1;

import java.util.Scanner;

/**
 * Created by TG on 08.11.19.
 */
public class Task6_RefactorToFunctions {
    // We know System.out already, System.in allows us to read from user
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // call function which returns an array of numbers the user inputs
        int[] numbers = getNumbersFromUser();

        // print the options the user have
        printOptions();
        int selection = scanner.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Printing all numbers");

                // we are passing the numbers array as a parameter
                printArrayNumbers(numbers);

                break;

            case 2:
                System.out.println("Printing sum of all numbers");

                // if the function returns an element, we can assign it to a variable of the return type
                int sum = sumArrayNumbers(numbers);
                System.out.println("Sum of all the given numbers is: " + sum);

                break;

            case 3:
                System.out.println("Printing average of all numbers");

                float average = averageArrayNumbers(numbers);
                System.out.println("Average of all the given numbers is: " + average);

                break;

            default:
                System.out.println("Number not available, please select one of the available numbers.");
        }
    }


    static int[] getNumbersFromUser () {
        System.out.println("How large do you want your array to be?");

        // read number from user and create int array of given size
        int arrSize = scanner.nextInt();
        int[] numbers = new int[arrSize];

        // fill the array with the input of the user
        for (int i = 0; i < arrSize; i++) {
            System.out.println("Please enter the " + (i + 1) + ". number");
            int currNum = scanner.nextInt();

            numbers[i] = currNum;
        }

        return numbers;
    }

    static void printArrayNumbers (int[] numbers) {
        // for each loop, in each iteration i takes the next number of the array
        for (int i : numbers) {
            System.out.println(i);
        }
    }


    static int sumArrayNumbers (int[] numbers) {
        int sum = 0;

        // simply adding each number to the sum
        for (int i : numbers) {
            sum += i;
        }

        return sum;
    }


    // Re-using the sumArrayNumbers method to calculate Average
    static float averageArrayNumbers (int[] numbers) {

        // casting the length of the array to a float (floating comma number)
        // this makes e.g. 6.0 out of 6 and is needed for actual division
        return sumArrayNumbers(numbers) / (float) numbers.length;
    }


    static void printOptions () {
        System.out.println();
        System.out.println("Please define what you want to do with the numbers now: (Enter one of the numbers)");
        System.out.println("1. Print all numbers");
        System.out.println("2. Sum up all numbers");
        System.out.println("3. Average all numbers");
    }
}

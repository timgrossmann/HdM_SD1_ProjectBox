package de.hdm.mi.sd1;

import java.util.Scanner;

/**
 * Created by TG on 08.11.19.
 */
public class Task7_ChristmasTree {
    public static void main(String[] args) {
        // We know System.out already, System.in allows us to read from user
        Scanner scanner = new Scanner(System.in);

        System.out.println("How tall do you want your tree to be?");
        int treeSize = scanner.nextInt();

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

            // Note that we can also use other ascii chars here
            System.out.println("▓");
        }

        System.out.println();
    }
}

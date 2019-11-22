package de.hdm.mi.sd1.Task9_CoordinateSystemClasses;

import java.util.Scanner;

/**
 * Created by TG on 13.11.19.
 */
public class CoordinateSystemApp {

    public static void main(String[] args) {
        // We know System.out already, System.in allows us to read from user
        final Scanner scanner = new Scanner(System.in);

        // Reading in the width and height for the coordinate system
        System.out.print("How wide do you want your grid to be? ");
        final int width = scanner.nextInt();

        System.out.print("How high do you want your grid to be? ");
        final int height = scanner.nextInt();

        // Creating a new instance of our CoordinateSystem class
        CoordinateSystem coordSystem = new CoordinateSystem(width, height);

        // Invoking the printGrid function on the current Instance of the object
        coordSystem.printGrid();
        System.out.println();

        // Creating two objects of type CoordinatePoint to add to the CoordinateSystem
        final CoordinatePoint cP1 = new CoordinatePoint(0, 0, 'X');
        final CoordinatePoint cP2 = new CoordinatePoint(3, 4, 'O');

        // This CoordinatePoint will throw an error when the width and height inputs are <= 5
        // (grid will contain indices only be 0-4)
        final CoordinatePoint cP3 = new CoordinatePoint(5, 5, 'O');

        // Add CoordinatePoints to CoordinateSystem
        coordSystem.addCoordinatePoint(cP1);
        coordSystem.addCoordinatePoint(cP2);

        // Print the grid with the now added CoordinatePoints
        coordSystem.printGrid();


        // ===============================================================================


        // We can also let the user define the CoordinatePoints dynamically
        for (int i = 0; i < 2; i++) {
            System.out.print("Please enter x-Coordinate of the CoordinatePoint: ");
            final int xCoord = scanner.nextInt();

            // nextInt() only reads the number and not the line break of the current line
            // if we want to read a full new line, we need to end the current line first
            System.out.print("Please enter y-Coordinate of the CoordinatePoint: ");
            final int yCoord = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Please enter the to be displayed value of the CoordinatePoint: ");
            final char value = scanner.nextLine().charAt(0);

            final CoordinatePoint coordPoint = new CoordinatePoint(xCoord, yCoord, value);
            coordSystem.addCoordinatePoint(coordPoint);

            System.out.println();
        }

        // Print the grid with the now added CoordinatePoints
        coordSystem.printGrid();
    }

}

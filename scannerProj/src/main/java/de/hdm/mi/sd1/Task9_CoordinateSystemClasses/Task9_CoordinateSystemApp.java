package de.hdm.mi.sd1.Task9_CoordinateSystemClasses;

import java.util.Scanner;

/**
 * Created by TG on 13.11.19.
 */
public class Task9_CoordinateSystemApp {

    public static void main(String[] args) {
        // We know System.out already, System.in allows us to read from user
        final Scanner scanner = new Scanner(System.in);

        // Reading in the width and height for the coordinate system
        System.out.print("How wide do you want your grid to be? ");
        final int width = scanner.nextInt();

        System.out.print("How high do you want your grid to be? ");
        final int height = scanner.nextInt();

        // Creating a new instance of our Task9_CoordinateSystem class
        Task9_CoordinateSystem coordSystem = new Task9_CoordinateSystem(width, height);

        // Invoking the printGrid function on the current Instance of the object
        coordSystem.printGrid();
        System.out.println();

        // Creating two objects of type Task9_CoordinatePoint to add to the Task9_CoordinateSystem
        final Task9_CoordinatePoint cP1 = new Task9_CoordinatePoint(0, 0, 'X');
        final Task9_CoordinatePoint cP2 = new Task9_CoordinatePoint(3, 4, 'O');

        // This Task9_CoordinatePoint will throw an error when the width and height inputs are <= 5
        // (grid will contain indices only be 0-4)
        final Task9_CoordinatePoint cP3 = new Task9_CoordinatePoint(5, 5, 'O');

        // Add CoordinatePoints to Task9_CoordinateSystem
        coordSystem.addCoordinatePoint(cP1);
        coordSystem.addCoordinatePoint(cP2);

        // Print the grid with the now added CoordinatePoints
        coordSystem.printGrid();


        // ===============================================================================


        // We can also let the user define the CoordinatePoints dynamically
        for (int i = 0; i < 2; i++) {
            System.out.print("Please enter x-Task8_Coordinate of the Task9_CoordinatePoint: ");
            final int xCoord = scanner.nextInt();

            // nextInt() only reads the number and not the line break of the current line
            // if we want to read a full new line, we need to end the current line first
            System.out.print("Please enter y-Task8_Coordinate of the Task9_CoordinatePoint: ");
            final int yCoord = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Please enter the to be displayed value of the Task9_CoordinatePoint: ");
            final char value = scanner.nextLine().charAt(0);

            final Task9_CoordinatePoint coordPoint = new Task9_CoordinatePoint(xCoord, yCoord, value);
            coordSystem.addCoordinatePoint(coordPoint);

            System.out.println();
        }

        // Print the grid with the now added CoordinatePoints
        coordSystem.printGrid();
    }

}

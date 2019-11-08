package de.hdm.mi.sd1.Task8_Classes;

/**
 * Created by TG on 08.11.19.
 */
public class CoordinateApp {
    public static void main(String[] args) {
        ////////////////////////////////////////////////////////////////////////
        // Constructor without

        // Classes can be instantiated with the new keyword
        Coordinate cord1 = new Coordinate();

        // x and y can be accessed from outside the class
        cord1.x = 1;
        cord1.y = 5;

        // value can't because it's private, this throws error
        // cord1.value = 15;

        // public Setter and Getter can be used to alter private variables
        cord1.setValue(15);

        System.out.println("1. X-Coordinate is: " + cord1.x);
        System.out.println("1. Y-Coordinate is: " + cord1.y);
        System.out.println("1. Value of Coordinate is: " + cord1.getValue());

        System.out.println();

        ////////////////////////////////////////////////////////////////////////
        // Constructor with parameters

        // We can have different Constructors that allow to pass values directly
        Coordinate cord2 = new Coordinate(3, 7, 20);

        System.out.println("2. X-Coordinate is: " + cord2.x);
        System.out.println("2. Y-Coordinate is: " + cord2.y);
        System.out.println("2. Value of Coordinate is: " + cord2.getValue());

        System.out.println();

        ////////////////////////////////////////////////////////////////////////
        // Static elements of the class

        // static variables and methods can be accessed without instantiating with new keyword
        String coordinateClassName = Coordinate.name;
        Coordinate cord3 = Coordinate.getRandomCoordinate();

        System.out.println("Coordinate static name: " + coordinateClassName);
        System.out.println("3. X-Coordinate is: " + cord3.x);
        System.out.println("3. Y-Coordinate is: " + cord3.y);
        System.out.println("3. Value of Coordinate is: " + cord3.getValue());
    }
}

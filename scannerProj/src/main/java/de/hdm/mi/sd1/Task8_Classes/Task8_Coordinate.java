package de.hdm.mi.sd1.Task8_Classes;

import java.util.Random;

/**
 * Created by TG on 08.11.19.
 */

/*
    Source: https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
     ____________________________________________________________
    |           │ Class │ Package │ Subclass │ Subclass │ World  |
    |           │       │         │(same pkg)│(diff pkg)│        |
    |───────────┼───────┼─────────┼──────────┼──────────┼────────|
    |public     │   +   │    +    │    +     │     +    │   +    |
    |───────────┼───────┼─────────┼──────────┼──────────┼────────|
    |protected  │   +   │    +    │    +     │     +    │        |
    |───────────┼───────┼─────────┼──────────┼──────────┼────────|
    |no modifier│   +   │    +    │    +     │          │        |
    |───────────┼───────┼─────────┼──────────┼──────────┼────────|
    |private    │   +   │         │          │          │        |
    |___________|_______|_________|__________|__________|________|

            + : accessible         blank : not accessible
*/

public class Task8_Coordinate {
    // can be accessed without instantiating new class
    static String name = "Task9_CoordinatePoint Class";

    // can be accessed from outside
    int x;

    // can be accessed from other classes in same package
    protected int y;

    // can only be accessed from this class
    private int value;

    // we can declare multiple constructors with different amounts of parameters
    Task8_Coordinate() {}
    Task8_Coordinate(int x, int y, int value) {
        this.x = x;
        this.y = y;
        this.value = value;
    }

    // getter for the private value
    public int getValue() {
        return value;
    }

    // setter for the private value
    public void setValue(int value) {
        this.value = value;
    }

    // private variable that is hidden from outside
    // static means it can be accessed without instantiating and can be used in static methods
    // final means this value can not be altered or re-assigned
    private static final Random RANDOM_GENERATOR = new Random();

    // methods can also return instances of classes
    public static Task8_Coordinate getRandomCoordinate () {
        int xCord = RANDOM_GENERATOR.nextInt(10);
        int yCord = RANDOM_GENERATOR.nextInt(10);
        int value = RANDOM_GENERATOR.nextInt(100);

        return new Task8_Coordinate(xCord, yCord, value);
    }
}

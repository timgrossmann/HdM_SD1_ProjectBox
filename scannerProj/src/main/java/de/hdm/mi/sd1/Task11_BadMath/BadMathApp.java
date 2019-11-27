package de.hdm.mi.sd1.Task11_BadMath;

import java.lang.Math;
import java.lang.instrument.Instrumentation;

/**
 * Created by TG on 27.11.19.
 */
public class BadMathApp {
    public static void main(String[] args) {
        // instantiate new BadMath object
        // pure "container" for methods used
        BadMath badMath = new BadMath();     // <- New memory is allocated for the class instance

        int a = -1;
        int b = 2;
        int circleRadius = 5;

        // methods only callable if we have an instance of the class
        int addedInts = badMath.addInt(a, b);
        int absValue = badMath.abs(a);
        double circleCircumfence = 2*badMath.pi*circleRadius; // <- (badMath.pi allocates 8 bytes)

        ////////////////////////////////////////////////////

        // no need to instantiate object since it does not serve any purpose in this case
        int addedIntsStatic = Math.addExact(a, b);
        double circleCircumfenceStatic = 2 * Math.PI * circleRadius;  // <- (Math.PI allocates 8 bytes)
    }

    /*

        Imagine we have 5 different classes all in need of the BadMath functionality

        Class 2:
            BadMath badMath = new BadMath();     // <- New memory is allocated for the class instance
            badMath.pi                           // takes an additional 8 bytes per instance

            Math.xyz                             // <- *No* instance of class is created, no new memory allocated
            Math.PI                              // already allocated in out BadMathApp

        Class 3:
            BadMath badMath = new BadMath();     // <- New memory is allocated for the class instance
            badMath.pi                           // takes an additional 8 bytes per instance

            Math.xyz                             // <- *No* instance of class is created, no new memory allocated
            Math.PI                              // already allocated in out BadMathApp

        Class 4:
            BadMath badMath = new BadMath();     // <- New memory is allocated for the class instance
            badMath.pi                           // takes an additional 8 bytes per instance

            Math.xyz                             // <- *No* instance of class is created, no new memory allocated
            Math.PI                              // already allocated in out BadMathApp

        Class 5:
            BadMath badMath = new BadMath();     // <- New memory is allocated for the class instance
            badMath.pi                           // takes an additional 8 bytes per instance

            Math.xyz                             // <- *No* instance of class is created, no new memory allocated
            Math.PI                              // already allocated in out BadMathApp
    */
}

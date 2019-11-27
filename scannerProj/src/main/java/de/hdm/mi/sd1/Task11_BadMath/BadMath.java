package de.hdm.mi.sd1.Task11_BadMath;

/**
 * Created by TG on 27.11.19.
 */
public class BadMath {
    public double pi = 3.14159265;

    public int addInt (int a, int b) {
        return a+b;
    }

    public int abs (int a) {
        if (a < 0) {
            return a * -1;
        }

        return a;
    }
}
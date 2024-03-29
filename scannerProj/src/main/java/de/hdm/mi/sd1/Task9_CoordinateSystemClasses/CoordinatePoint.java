package de.hdm.mi.sd1.Task9_CoordinateSystemClasses;

/**
 * Created by TG on 13.11.19.
 */
public class CoordinatePoint {
    private int xCoord;
    private int yCoord;
    private char value;

    // parameters of a method can also have the final keyword, making them non-mutatable (not changable)
    public CoordinatePoint(final int xCoord, final int yCoord, final char value) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.value = value;
    }


    // Getters and Setters for the private variables invisible from outside this class
    public int getxCoord() {
        return xCoord;
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }
}

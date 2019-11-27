package de.hdm.mi.sd1.Task12_SimpleDungeonEscape;

/**
 * Created by TG on 26.11.19.
 */
public class Goal {
    // x and y position on the board
    private int xPos;
    private int yPos;

    public Goal(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }
}

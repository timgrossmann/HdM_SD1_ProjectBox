package de.hdm.mi.sd1.Task12_SimpleDungeonEscape;

/**
 * Created by TG on 26.11.19.
 */
public class Player {
    // x and y position on the board
    private int xPos;
    private int yPos;

    public Player(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
}

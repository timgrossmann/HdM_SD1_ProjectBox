package de.hdm.mi.sd1.Task_11_SimpleDungeonEscape;

import java.util.Scanner;

/**
 * Created by TG on 26.11.19.
 */
public class DungeonGame {

    public static void main(String[] args) {
        Dungeon dungeon = new Dungeon();
        Scanner sc = new Scanner(System.in);

        dungeon.printDungeon();
        int dec = 1;
        boolean gameOver = false;

        while (dec != 0 && !gameOver) {
            printOptions();
            dec = sc.nextInt();

            switch (dec) {
                case 1:
                    dungeon.movePlayerUp();
                    break;
                case 2:
                    dungeon.movePlayerDown();
                    break;
                case 3:
                    dungeon.movePlayerLeft();
                    break;
                case 4:
                    dungeon.movePlayerRight();
                    break;
                default:
            }

            dungeon.printDungeon();
            gameOver = dungeon.isGameOver();
        }

        System.out.println("You won!");
    }

    private static void printOptions () {
        System.out.println("Where do you want to go next?");
        System.out.println("1. Up");
        System.out.println("2. Down");
        System.out.println("3. Left");
        System.out.println("4. Right");
        System.out.println("0. Exit");
    }
}

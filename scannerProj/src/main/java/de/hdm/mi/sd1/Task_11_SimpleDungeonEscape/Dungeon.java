package de.hdm.mi.sd1.Task_11_SimpleDungeonEscape;

/**
 * Created by TG on 26.11.19.
 */
public class Dungeon {
    private int[][] dungeon;
    private Player player;
    private Goal goal;

    public Dungeon() {
        this.dungeon = initDungeon();
        this.player = new Player(1, 1);
        this.goal = new Goal(2, 3);
    }

    private int[][] initDungeon() {
        int[][] dungeon = {
                {1, 1, 1, 1, 1},
                {1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1},
                {1, 1, 1, 1, 1},
        };

        return dungeon;
    }

    public void printDungeon() {
        System.out.println();

        int playerPosX = player.getxPos();
        int playerPosY = player.getyPos();

        int goalPosX = goal.getxPos();
        int goalPosY = goal.getyPos();

        for (int i = 0; i < dungeon.length; i++) {
            for (int j = 0; j < dungeon[i].length; j++) {

                // check if the current position is the player or goal
                if ((i == playerPosY) && (j == playerPosX)) {
                    System.out.print(3);

                } else if ((i == goalPosY) && (j == goalPosX)) {
                    System.out.print(2);

                } else {
                    System.out.print(dungeon[i][j]);
                }

            }
            System.out.println();
        }

        System.out.println();
    }


    // Changing the player position based on which decision has been made
    // This can be nicely "refactored" since the method bodies look quite similar
    public void movePlayerUp() {
        int playerPosX = player.getxPos();
        int playerPosY = player.getyPos();

        // keeping the player in the boundries with min/max
        int newPlayerPosY = Math.max(0, playerPosY - 1);

        // and only updating the position if we can actually walk "onto" the field
        if (dungeon[newPlayerPosY][playerPosX] != 1) {
            player.setyPos(newPlayerPosY);
        }
    }

    public void movePlayerDown() {
        int playerPosX = player.getxPos();
        int playerPosY = player.getyPos();

        int newPlayerPosY = Math.min(playerPosY + 1, dungeon.length);
        if (dungeon[newPlayerPosY][playerPosX] != 1) {
            player.setyPos(newPlayerPosY);
        }
    }

    public void movePlayerLeft() {
        int playerPosX = player.getxPos();
        int playerPosY = player.getyPos();

        int newPlayerPosX = Math.max(0, playerPosX - 1);
        if (dungeon[playerPosY][newPlayerPosX] != 1) {
            player.setxPos(newPlayerPosX);
        }
    }

    public void movePlayerRight() {
        int playerPosX = player.getxPos();
        int playerPosY = player.getyPos();

        int newPlayerPosX = Math.min(playerPosX + 1, dungeon[0].length);
        if (dungeon[playerPosY][newPlayerPosX] != 1) {
            player.setxPos(newPlayerPosX);
        }
    }

    // check if the player is on the same location as the goal
    public boolean isGameOver () {
        int playerPosX = player.getxPos();
        int playerPosY = player.getyPos();

        int goalPosX = goal.getxPos();
        int goalPosY = goal.getyPos();

        // we can simply return a condition that evaluates to true or false
        // this is the same syntax we use in an if condition
        return ((goalPosX == playerPosX) && (goalPosY == playerPosY));
    }
}

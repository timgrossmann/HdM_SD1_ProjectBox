package de.hdm.mi.sd1.Task9_CoordinateSystemClasses;

/**
 * Created by TG on 13.11.19.
 */
public class CoordinateSystem {
    private String[][] grid;

    // Constructor that calls the initGrid function declared further down to fill the grid of the object to the given width and height
    public CoordinateSystem (final int width, final int height) {
        this.grid = initGrid(width, height);
    }


    // We can also use "classes" as parameters to be passed to functions
    public void addCoordinatePoint (final CoordinatePoint coord) {

        // As described in the initGrid method, we can directly access each position in the grid
        // with the given x and y coordinates. This makes it easy to assign the value returned from the CoordinatePoint
        grid[coord.getyCoord()][coord.getxCoord()] = coord.getValue();

    }


    private String[][] initGrid (final int width, final int height) {
        String[][] grid = new String[height][width];

        /*
            Considering the iteration direction, we have height number of rows and width number of columns.

            Rows (x - direction)
            ---------->
          C | . . . . .
      y   O | . . . . .
      |   L | . . . . .
      d   S | . . . . .
      i    ` ´
      r     '

            Indexing the first element in the first row is simple, we use grid[0][0] here.
            The second element in the first row however ist !not! grid[1][0] but the index for the rows comes first
            Meaning that indexing the second element in the first row is done like this: grid[0][1]
            Basically x and y are switched to y and x => grid[y][x]
        */

        for (int y = 0; y < height; y++ ) {
            for (int x = 0; x < width; x++) {
                grid[y][x] = "-";
            }
        }

        return grid;
    }


    public void printGrid () {
        for (String[] row : grid) {
            for (String x : row) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}

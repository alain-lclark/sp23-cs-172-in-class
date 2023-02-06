public class Minesweeper {

    public static void main(String[] unused) {
        StdOut.println("Welcome to minesweeper");
        int size = 10, numMines = 10;
        boolean[][] grid = new boolean[size][size];
        boolean[][] revealed = new boolean[size][size];

        // initialize grid: place bombs in random location
        initMinefield(numMines, grid);

        // 1. draw the grid (take into account revealed)
        StdDraw.setScale(-0.5, size - 0.5); // change the coordinate system to be to use array indices as coordinates
        drawMinefield(grid, revealed);

        // keep doing these steps until otherwise told
        while (true) {
            // 2. wait until the user clicks (gives coordinates)
            // 3. update "revealed" (based on these coordinates)
            handleMouseClick(grid, revealed);

            drawMinefield(grid, revealed);

            // 4. check for losing/winning condition
            if (hasWon(grid, revealed)) {
                StdOut.println("You won!");
                break;
            }
        }
    }

    public static boolean hasWon(boolean[][] grid, boolean[][] revealed) {
        return false;
    }

    public static void handleMouseClick(boolean[][] grid, boolean[][] revealed) {
    }

    public static void drawMinefield(boolean[][] grid, boolean[][] revealed) {
        int x = 0;
        while (x < grid.length) {
            int y = 0;
            while (y < grid.length) {
                StdDraw.square(x, y, 0.5);
                y = y + 1;
            }
            x = x + 1;
        }
    }

    public static void initMinefield(int numMines, boolean[][] grid) {
        int x = StdRandom.uniformInt(grid.length);
    }

}

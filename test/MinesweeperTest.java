import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinesweeperTest {

    @org.junit.jupiter.api.Test
    void initMinefield() {
        boolean[][] grid = new boolean[3][3];
        Minesweeper.initMinefield(5, grid);
        int count = 0;
        for (int x = 0; x < grid.length; ++x) {
            for (int y = 0; y < grid.length; ++y) {
                if (grid[x][y]) ++count;
            }
        }
        assertEquals(5, count);
    }

    @Test
    void countNeighboringMines() {
        boolean[][] grid = {
                { false,  true, false },
                { false, false, false },
                { false, false, false }
        };
        assertEquals(1, Minesweeper.countNeighboringMines(grid, 1, 1));
        assertEquals(1, Minesweeper.countNeighboringMines(grid, 0, 0));
    }

    @Test
    void hasWon() {
        boolean[][] grid = {
                { false,  true, false },
                { false, false, false },
                { false, false, false }
        };
        boolean[][] revealed = {
                {  true, false,  true },
                {  true,  true,  true },
                {  true,  true,  true }
        };
        assertTrue(Minesweeper.hasWon(grid, revealed));
    }

    @Test
    void hasNotYetWon() {
        boolean[][] grid = {
                { false,  true, false },
                { false, false, false },
                { false, false, false }
        };
        boolean[][] revealed = {
                { true,  false, false },
                { true,   true, false },
                { true,   true, false }
        };
        assertFalse(Minesweeper.hasWon(grid, revealed));
    }

}
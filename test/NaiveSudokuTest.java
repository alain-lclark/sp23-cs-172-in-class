import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Sudoku solver.
 *
 * @author Peter Drake
 */
class NaiveSudokuTest {

    @Test
    void convertsGridToString() {
        int[][] grid = NaiveSudoku.createSquares();
        grid[0][1] = 1;
        grid[1][8] = 8;
        grid[7][4] = 5;
        String correct = ".1.......\n" +
                         "........8\n" +
                         ".........\n" +
                         ".........\n" +
                         ".........\n" +
                         ".........\n" +
                         ".........\n" +
                         "....5....\n" +
                         ".........\n";
        assertEquals(correct, NaiveSudoku.toString(grid));
    }

    @Test
    void convertsStringToGrid() {
        String correct =    ".1.......\n" +
                            "........8\n" +
                            ".........\n" +
                            ".........\n" +
                            ".........\n" +
                            ".........\n" +
                            ".........\n" +
                            "....5....\n" +
                            ".........\n";
        int[][] grid = NaiveSudoku.createSquares(correct);
        assertEquals(correct, NaiveSudoku.toString(grid));
    }

    @Test
    void findsOneMissingNumber() {
        // This puzzle adapted from www.puzzles.ca/sudoku/
        String diagram =    "897312456\n" +
                            "613594728\n" +
                            "425678913\n" +
                            "941867532\n" +
                            "538921647\n" +
                            "276435.91\n" +
                            "359186274\n" +
                            "764253189\n" +
                            "182749365\n";
        int[][] grid = NaiveSudoku.createSquares(diagram);
        assertTrue(NaiveSudoku.solve(grid));
        String correct =    "897312456\n" +
                            "613594728\n" +
                            "425678913\n" +
                            "941867532\n" +
                            "538921647\n" +
                            "276435891\n" +
                            "359186274\n" +
                            "764253189\n" +
                            "182749365\n";
        assertEquals(correct, NaiveSudoku.toString(grid));
    }

    @Test
    void findsTwoMissingNumbers() {
        // This puzzle adapted from www.puzzles.ca/sudoku/
        String diagram =    "897312456\n" +
                "6135..728\n" +
                "425678913\n" +
                "941867532\n" +
                "538921647\n" +
                "276435891\n" +
                "359186274\n" +
                "764253189\n" +
                "182749365\n";
        int[][] grid = NaiveSudoku.createSquares(diagram);
        assertTrue(NaiveSudoku.solve(grid));
        String correct =    "897312456\n" +
                "613594728\n" +
                "425678913\n" +
                "941867532\n" +
                "538921647\n" +
                "276435891\n" +
                "359186274\n" +
                "764253189\n" +
                "182749365\n";
        assertEquals(correct, NaiveSudoku.toString(grid));
    }

    @Test
    void solvesEasyPuzzle() {
        // This puzzle from www.puzzles.ca/sudoku/
        String diagram =    ".97..24..\n" +
                            "....9..28\n" +
                            "4.567..1.\n" +
                            ".....7...\n" +
                            ".3.......\n" +
                            "..6..5.9.\n" +
                            "...1....4\n" +
                            "764......\n" +
                            "18....36.\n";
        int[][] grid = NaiveSudoku.createSquares(diagram);
        assertTrue(NaiveSudoku.solve(grid));
        String correct =    "897312456\n" +
                            "613594728\n" +
                            "425678913\n" +
                            "941867532\n" +
                            "538921647\n" +
                            "276435891\n" +
                            "359186274\n" +
                            "764253189\n" +
                            "182749365\n";
        assertEquals(correct, NaiveSudoku.toString(grid));
    }

}

public class NaiveSudoku {
    public static int[][] createSquares() {
        return new int[9][9];
    }

    public static int[][] createSquares(String puzzle) {
        int[][] grid = createSquares();
        int index = 0;
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                if (puzzle.charAt(index) == '\n') ++index;
                char c = puzzle.charAt(index);
                if (c != '.') grid[i][j] = c - '0';
                ++index;
            }
        }
        return grid;
    }

    public static String toString(int[][] grid) {
        String s = "";
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                if (grid[i][j] == 0) s += ".";
                else                 s += grid[i][j];
            }
            s += "\n";
        }
        return s;
    }

    public static boolean solve(int[][] grid) {
        for (int row = 0; row < 9; ++row) {
            for (int col = 0; col < 9; ++col) {
                if (grid[row][col] == 0) {
                    for (int val = 1; val <= 9; ++val) {
                        grid[row][col] = val;
                        if (solve(grid)) {
                            return true;
                        }
                    }
                    grid[row][col] = 0;
                }
            }
        }
        return isValid(grid);
    }

    public static boolean isValid(int[][] grid) {
        if (!isRowValid(grid)) return false;
        if (!isColValid(grid)) return false;
        return isBlkValid(grid);
    }

    public static boolean isRowValid(int[][] grid) {
        for (int i = 0; i < 9; ++i) {
            int[] nums = new int[10];
            for (int j = 0; j < 9; ++j) {
                if (grid[i][j] < 1 || grid[i][j] > 9) return false;
                if (nums[grid[i][j]] != 0) return false;
                nums[grid[i][j]] = 1;
            }
        }
        return true;
    }

    public static boolean isColValid(int[][] grid) {
        for (int j = 0; j < 9; ++j) {
            int[] nums = new int[10];
            for (int i = 0; i < 9; ++i) {
                if (grid[i][j] < 1 || grid[i][j] > 9) return false;
                if (nums[grid[i][j]] != 0) return false;
                nums[grid[i][j]] = 1;
            }
        }
        return true;
    }

    public static boolean isBlkValid(int[][] grid) {
        for (int blk_i = 0; blk_i < 9; blk_i += 3) {
            for (int blk_j = 0; blk_j < 9; blk_j += 3) {
                int[] nums = new int[10];
                for (int i = blk_i; i < blk_i + 3; ++i) {
                    for (int j = blk_j; j < blk_j + 3; ++j) {
                        if (grid[i][j] < 1 || grid[i][j] > 9) return false;
                        if (nums[grid[i][j]] != 0) return false;
                        nums[grid[i][j]] = 1;
                    }
                }
            }
        }
        return true;
    }

}

import java.util.ArrayList;
import java.util.List;

class NQueens {

    public boolean isValid(char[][] grid, int row, int col, int n) {
        // Check column
        for (int i = 0; i < row; i++) {
            if (grid[i][col] == 'Q') {
                return false;
            }
        }

        // Check left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (grid[i][j] == 'Q') {
                return false;
            }
        }

        // Check right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (grid[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public void solveNQueensHelper(char[][] grid, int row, int n, List<List<String>> res) {
        if (row == n) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(new String(grid[i]));
            }
            res.add(temp);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isValid(grid, row, col, n)) {
                grid[row][col] = 'Q';
                solveNQueensHelper(grid, row + 1, n, res);
                grid[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        char[][] grid = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = '.';
            }
        }

        List<List<String>> res = new ArrayList<>();
        solveNQueensHelper(grid, 0, n, res);
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 6;
        List<List<String>> solutions = solution.solveNQueens(n);

        for (List<String> solutionBoard : solutions) {
            for (String row : solutionBoard) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}

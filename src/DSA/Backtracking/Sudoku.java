package DSA.Backtracking;

public class Sudoku {
    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }

    boolean solve(char[][] board, int row, int col) {
        if (row == board.length) return true;

        if (col == board[0].length) return solve(board, row + 1, 0);
        if (board[row][col] != '.') return solve(board, row, col + 1);

        for (char c = '1'; c <= '9'; c++) {
            if (isSafe(board, row, col, c)) {
                board[row][col] = c;
                if (solve(board, row, col + 1)) return true;
                board[row][col] = '.';
            }
        }
        return false;
    }

    boolean isSafe(char[][] board, int row, int col, char c) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == c || board[i][col] == c)
                return false;
        }

        int rowIndex = (row / 3) * 3;
        int colIndex = (col / 3) * 3;

        for (int i = rowIndex; i < rowIndex + 3; i++) {
            for (int j = colIndex; j < colIndex + 3; j++) {
                if (board[i][j] == c)
                    return false;
            }
        }

        return true;
    }
}

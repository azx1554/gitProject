package Xi.LeetCode.OneHundredFifty;

public class Problem130 {

    public static void solve(char[][] board) {
        int m = board.length;
        if (m == 0) {
            return;
        }
        int n = board[0].length;
        if (n == 0){
            return;
        }
        boolean[][] changeToO = new boolean[m][n];
        for (int i = 0; i < n; i++) {
            if (board[0][i] == 'O') {
                judgeNextCell(board, 0, i, changeToO);
            }
            if (board[m-1][i] == 'O') {
                judgeNextCell(board, m-1, i, changeToO);
            }
        }
        for (int i = 1; i < m - 1; i++) {
            if (board[i][0] == 'O') {
                judgeNextCell(board, i, 0, changeToO);
            }
            if (board[i][n-1] == 'O') {
                judgeNextCell(board, i, n-1, changeToO);
            }
        }
        for (int i = 0 ; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!changeToO[i][j]) {
                    board[i][j] = 'X';
                }
            }
        }
    }

    public static void judgeNextCell(char[][] board, int m, int n, boolean[][] changeToO) {
        if (board[m][n] == 'X' || changeToO[m][n]) {
            return;
        } else {
            changeToO[m][n] = true;
            if (m > 0) {
                judgeNextCell(board, m - 1, n, changeToO);
            }
            if (m < board.length - 1) {
                judgeNextCell(board, m + 1, n, changeToO);
            }
            if (n > 0) {
                judgeNextCell(board, m, n - 1, changeToO);
            }
            if (n < board[0].length - 1) {
                judgeNextCell(board, m, n + 1, changeToO);
            }
        }
    }

    public static void main(String[] args) {
        char[][] board = new char[][]{{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        solve(board);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j <board[0].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }
    }
}

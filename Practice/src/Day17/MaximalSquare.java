package Day17;

public class MaximalSquare {
    //Given an m x n binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.
    private int[][] memo;
    private char[][] matrix;
    private int m, n, sqrlen;
    public int maximalSquare(char[][] matrix) {
        this.m = matrix.length;
        this.n = matrix[0].length;
        this.matrix = matrix;
        this.memo = new int[m][n];

        dp(m - 1, n - 1);

        return sqrlen * sqrlen;
    }
    private int dp(int i, int j) {
        if (i < 0 || j < 0)
            return 0;

        if (memo[i][j] != 0)
            return memo[i][j];

        if (matrix[i][j] == '1')
            memo[i][j] = Math.min(Math.min(dp(i - 1, j), dp(i, j - 1)), dp(i - 1, j - 1)) + 1;
        else {
            dp(i - 1, j);
            dp(i, j - 1);
        }

        sqrlen = Math.max(sqrlen, memo[i][j]);

        return memo[i][j];
    }
}

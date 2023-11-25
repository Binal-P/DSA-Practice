package Day11;

import java.util.Arrays;

public class UniquePathsII {
    //You are given an m x n integer array grid. There is a robot initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.
    //
    //An obstacle and space are marked as 1 or 0 respectively in grid. A path that the robot takes cannot include any square that is an obstacle.
    //
    //Return the number of possible unique paths that the robot can take to reach the bottom-right corner.
    //
    //The testcases are generated so that the answer will be less than or equal to 2 * 109.

    int[][] dp = new int[105][105];
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length, m = obstacleGrid[0].length;
        for(int[] ar:dp){
            Arrays.fill(ar,-1);
        }
        return solve(n-1,m-1,obstacleGrid);
    }
    public int solve(int r, int c, int[][] grid){
        int n = grid.length,m=grid[0].length;
        if( r < 0 || c < 0 || grid[r][c] == 1)
            return 0;
        if(dp[r][c] != -1)
            return dp[r][c];
        if(r == 0 && c == 0){
            return 1;
        }
        int cost = 0;
        int a =solve(r,c-1,grid);
        int b =solve(r-1,c,grid);
        cost+=a+b;
        return dp[r][c] = cost;
    }
}

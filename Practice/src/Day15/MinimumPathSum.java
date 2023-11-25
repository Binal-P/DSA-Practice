package Day15;

import java.util.Arrays;

public class MinimumPathSum {
    //Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.
    //
    //Note: You can only move either down or right at any point in time.
    //
    //
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for (int[] row:dp){
            Arrays.fill(row,-1);
        }
        return minPathSum(grid,0,0,dp);
    }
    public int minPathSum(int[][] grid,int row, int col,int[][] dp){
        if(row==grid.length -1 && col ==grid[0].length-1){
            return grid[row][col];
        }
        if(row>grid.length-1|| col > grid[0].length-1){
            return Integer.MAX_VALUE;
        }
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        return dp[row][col]=grid[row][col] + Math.min(minPathSum(grid,row+1,col,dp),minPathSum(grid, row, col + 1, dp));
    }

}

package Day10;

import java.util.Arrays;

public class UniquePaths {
    //There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.
    //
    //Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.
    //
    //The test cases are generated so that the answer will be less than or equal to 2 * 109.
    public int f(int i, int j, int[][] dp) {
        int ans =0;
        if(i<0 || j<0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(i==0 &&j==0){
            return 1;
        }else{
            ans+=f(i-1,j,dp);
            ans+= f(i,j-1,dp);
        }
        return dp[i][j] = ans;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] a : dp){
            Arrays.fill(a,-1);
        }
        return f(m-1,n-1,dp);
    }
}

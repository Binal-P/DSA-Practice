package Day14;

import java.util.Arrays;

public class SubsetSumGFG {
    //Given an array of non-negative integers, and a value sum, determine if there is a subset of the given set with sum equal to given sum.
    //https://practice.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab
    static Boolean isSubsetSum(int n, int arr[], int sum){
        int[][] dp = new int[n+1][sum+1];
        for(int[] ar:dp){
            Arrays.fill(ar,-1);
        }
        boolean ans = false;
        if(f(n,sum,arr,dp) ==1){
            ans =  true;
        }
        return ans;
    }
    static int f(int n, int sum, int[] arr,int[][] dp ){
        if(sum == 0){
            return 1;
        }
        if(n<=0){
            return 0;
        }
        if(dp[n-1][sum]!=-1){
            return dp[n-1][sum];
        }
        if(arr[n-1] >sum){
            return dp[n-1][sum] = f(n-1,sum,arr,dp);
        } else if(f(n-1,sum,arr,dp) != 0 || f(n - 1, sum - arr[n - 1],arr,dp)!= 0){
            return dp[n-1][sum]=1;
        } else{
            return dp[n-1][sum]=0;
        }
    }
}

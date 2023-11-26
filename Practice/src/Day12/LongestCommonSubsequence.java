package Day12;

import java.util.Arrays;

public class LongestCommonSubsequence {
    //Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.
    //
    //A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
    //
    //For example, "ace" is a subsequence of "abcde".
    //A common subsequence of two strings is a subsequence that is common to both strings.
    int[][] dp = new int[1000][1000];
    public int longestCommonSubsequence(String text1, String text2) {
        for(int[] ar:dp){
            Arrays.fill(ar,-1);
        }
        return longest(text1,text2,0,0);
    }
    public int longest(String text1,String text2,int i,int j){
        int count =0;
        if(i>=text1.length() || j>=text2.length()){
            return 0;
        }
        if(dp[i][j] != -1)
            return dp[i][j];
        if(text1.charAt(i)==text2.charAt(j)){
            return dp[i][j] = 1+longest(text1,text2, i+1,j+1);
        } else{
            return dp[i][j] = Math.max(longest(text1,text2,i+1,j),longest(text1,text2,i,j+1));
        }
    }
}

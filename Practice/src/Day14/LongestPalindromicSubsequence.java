package Day14;

import java.util.Arrays;

public class LongestPalindromicSubsequence {
    //Given a string s, find the longest palindromic subsequence's length in s.
    //
    //A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.
    //
    //
    //
    //Example 1:
    //
    //Input: s = "bbbab"
    //Output: 4
    //Explanation: One possible longest palindromic subsequence is "bbbb".
    //Example 2:
    //
    //Input: s = "cbbd"
    //Output: 2
    //Explanation: One possible longest palindromic subsequence is "bb".
    int[][] dp = new int[1000][1000];
    public int longestPalindromeSubseq(String s) {
        for(int[] ar:dp){
            Arrays.fill(ar,-1);
        }

        return longestPalindrome(s,0,s.length()-1);
    }
    public int longestPalindrome(String s, int i, int j){
        if(i==j){
            return 1;
        }
        if(i>j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int max = 0;
        if(s.charAt(i)==s.charAt(j)){
            max= 2+ longestPalindrome(s,i+1,j-1);
        }else{
            max= Math.max(longestPalindrome(s,i,j-1),longestPalindrome(s,i+1,j));
        }
        dp[i][j] = max;
        return max;
    }
}

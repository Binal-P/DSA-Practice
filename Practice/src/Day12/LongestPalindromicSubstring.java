package Day12;

public class LongestPalindromicSubstring {
    //Given a string s, return the longest
    //palindromic
    //
    //substring
    // in s.
    //
    //
    //
    //Example 1:
    //
    //Input: s = "babad"
    //Output: "bab"
    //Explanation: "aba" is also a valid answer.
    //Example 2:
    //
    //Input: s = "cbbd"
    //Output: "bb"
    String max = "";
    int maxLength = 0;
    public String longestPalindrome(String s) {
        for(int i=0;i<s.length();i++){
            longestPalindrome(s,i,i);
            longestPalindrome(s,i,i+1);
        }
        return max;
    }
    public void longestPalindrome(String s, int startIndex, int endIndex){

        if(startIndex>endIndex || startIndex<0 || endIndex>=s.length() ||s.charAt(startIndex)!=s.charAt(endIndex)){
            return;
        }
        if(maxLength < endIndex-startIndex+1){
            maxLength = endIndex-startIndex+1;
            max = s.substring(startIndex,endIndex+1);
        }
        longestPalindrome(s,startIndex-1,endIndex+1);
    }
}

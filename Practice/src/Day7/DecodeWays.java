package Day7;

import java.util.Arrays;

public class DecodeWays {
    //A message containing letters from A-Z can be encoded into numbers using the following mapping:
    //
    //'A' -> "1"
    //'B' -> "2"
    //...
    //'Z' -> "26"
    //To decode an encoded message, all the digits must be grouped then mapped back into letters using the reverse of the mapping above (there may be multiple ways). For example, "11106" can be mapped into:
    //
    //"AAJF" with the grouping (1 1 10 6)
    //"KJF" with the grouping (11 10 6)
    //Note that the grouping (1 11 06) is invalid because "06" cannot be mapped into 'F' since "6" is different from "06".
    //
    //Given a string s containing only digits, return the number of ways to decode it.
    //
    //The test cases are generated so that the answer fits in a 32-bit integer.
    //
    //Example 1:
    //
    //Input: s = "12"
    //Output: 2
    //Explanation: "12" could be decoded as "AB" (1 2) or "L" (12).
    public int numDecodings(String s) {
        int n = s.length();
        int[] mem = new int[n];
        Arrays.fill(mem,-1);
        return numDecodings(s,0,mem);
    }
    public int numDecodings(String s, int i, int[] mem){
        int n = s.length();
        if(i==n)
            return 1;
        if(s.charAt(i) == '0'){
            return 0;
        }
        if (mem[i] != -1){
            return mem[i];
        }
        int count = numDecodings(s,i+1,mem);
        if(i<n-1 && ((s.charAt(i)-'0')*10+(s.charAt(i+1)-'0'))<27){
            count += numDecodings(s,i+2,mem);
        }
        return mem[i] = count;
    }
}

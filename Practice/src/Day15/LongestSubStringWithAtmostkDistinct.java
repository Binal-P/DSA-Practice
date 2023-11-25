package Day15;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithAtmostkDistinct {
    //Given a string s and an integer k, return the length of the longest
    //substring
    // of s that contains at most k distinct characters.
    //
    //
    //
    //Example 1:
    //
    //Input: s = "eceba", k = 2
    //Output: 3
    //Explanation: The substring is "ece" with length 3.
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        Map<Character,Integer> counter = new HashMap<>();
        int n= s.length();
        int left =0;
        int max_size =0;
        for(int right =0;right<s.length();right++){
            counter.put(s.charAt(right),counter.getOrDefault(s.charAt(right),0)+1);
            if(counter.size()<=k){
                max_size++;
            } else{
                counter.put(s.charAt(right-max_size),counter.get(s.charAt(right-max_size))-1);
                if(counter.get(s.charAt(right-max_size))==0){
                    counter.remove(s.charAt(right-max_size));
                }
            }
        }
        return max_size;
    }
}

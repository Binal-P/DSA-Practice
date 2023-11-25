package Day8;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {
    public int lengthOfLongestSubString(String s){
        int max =0;
        int index=0;
        while(index<s.length()){
            max = Math.max(max,lengthOfLongestSubString(s,index,new HashSet<Character>(),0));
            index++;
        }
        return max;
    }

    private int lengthOfLongestSubString(String s, int index, HashSet<Character> set, int count) {
        if(index==s.length() || set.contains(s.charAt(index))){
            return count;
        } else{
            set.add(s.charAt(index));
            return lengthOfLongestSubString(s, index+1,set,count+1);
        }
    }

    //Second way is sliding window.
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength =0;
        Set<Character> characterSet = new HashSet<>();
        int start =0;
        int end=0;
        while(end<n){
            if(!characterSet.contains(s.charAt(end))){
                characterSet.add(s.charAt(end));
                maxLength = Math.max(maxLength,end-start+1);
                end++;
            } else {
                characterSet.remove(s.charAt(start));
                start++;
            }
        }
        return maxLength;
    }
}

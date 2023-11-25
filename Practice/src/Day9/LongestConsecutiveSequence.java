package Day9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class LongestConsecutiveSequence {
    //Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
    //
    //You must write an algorithm that runs in O(n) time.
    //
    //
    //
    //Example 1:
    //
    //Input: nums = [100,4,200,1,3,2]
    //Output: 4
    //Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
    public int longestConsecutive(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int max=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            max = Math.max(max, recur(set,map,nums[i]-1));
        }
        return max;
    }

    private int recur(Set<Integer> set, Map<Integer, Integer> map, int i) {
        if(map.containsKey(i)){
            return map.get(i);
        }
        if(set.contains(i)){
            int k = 1+recur(set,map,i-1);
            map.put(i,k);
            return k;
        } else{
            map.put(i,1);
            return 1;
        }
    }
}

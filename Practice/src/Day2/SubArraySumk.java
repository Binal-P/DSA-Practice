package Day2;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumk {
    //Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
    //
    //A subarray is a contiguous non-empty sequence of elements within an array.
    //
    // TC:O(n)
    //SC: O(1)
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> oMap = new HashMap<>();
        oMap.put(0,1);
        int preSum =0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            preSum += nums[i];
            if(oMap.containsKey(preSum-k)){
                count +=oMap.get(preSum-k);
            }
            oMap.put(preSum,oMap.getOrDefault(preSum,0)+1);
        }
        return count;
    }
}

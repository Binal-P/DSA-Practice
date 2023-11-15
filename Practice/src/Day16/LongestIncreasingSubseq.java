package Day16;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubseq {
    //Given an integer array nums, return the length of the longest strictly increasing
    //subsequence
    //.
    //
    //
    //
    //Example 1:
    //
    //Input: nums = [10,9,2,5,3,7,101,18]
    //Output: 4
    //Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
    public int lengthOfLIS(int[] nums) {
        List<Integer> sub = new ArrayList<>();
        sub.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            int num = nums[i];
            if(num>sub.get(sub.size()-1)){
                sub.add(num);
            } else{
                int j = binarySearch(sub,num);
                sub.set(j,num);
            }
        }
        return sub.size();
    }

    private int binarySearch(List<Integer> sub, int num){
        int left =0;
        int right = sub.size()-1;
        int mid = (left+right)/2;
        while(left<right){
            mid = (left+right)/2;
            if(sub.get(mid)==num){
                return mid;
            }
            if(sub.get(mid)<num){
                left = mid+1;
            } else{
                right = mid;
            }
        }
        return left;
    }
}

package Recursion.RecursionPractice;

import java.util.ArrayList;
import java.util.List;

public class LinearSearchWithoutPassingListInArg {
    public List<Integer> linearSearch(int[] nums, int target, int start){
        List<Integer> ans = new ArrayList<>();
        if(start> nums.length-1){
            return ans;
        }
        if(nums[start]==target){
            ans.add(start);
        }
        List<Integer> ansFromCall = linearSearch(nums,target,start+1);
        ans.addAll(ansFromCall);
        return ans;
    }

}

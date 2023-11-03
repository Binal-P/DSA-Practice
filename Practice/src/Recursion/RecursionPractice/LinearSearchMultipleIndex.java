package Recursion.RecursionPractice;

import java.util.ArrayList;
import java.util.List;

public class LinearSearchMultipleIndex {
    public List<Integer> search(int[] nums, int target){
        List<Integer> list = new ArrayList<>();
        return search(nums,target,0,list);
    }

    private List<Integer> search(int[] nums, int target, int start,List<Integer> ans) {
        if(start> nums.length-1){
            return ans;
        }
        if(nums[start]==target){
            ans.add(start);
        }
        return search(nums,target,start+1, ans);
    }


}

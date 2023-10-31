package Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class prob3sum {
    //Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
    //
    //Notice that the solution set must not contain duplicate triplets.
    //
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum>0){
                    k--;
                } else if(sum<0){
                    j++;
                } else{
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    k--;
                    j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                }
            }
        }
        return result;
    }
}

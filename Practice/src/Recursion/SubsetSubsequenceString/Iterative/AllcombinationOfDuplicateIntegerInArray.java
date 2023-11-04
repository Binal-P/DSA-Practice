package Recursion.SubsetSubsequenceString.Iterative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllcombinationOfDuplicateIntegerInArray {
    public List<List<Integer>> getAllSubsets(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int i=0;i<nums.length;i++){
            start = 0;
            //if current and previous element is same, start = end +1;
            if(i>0 && nums[i] == nums[i-1]){
                start = end+1;
            }
            end = outer.size()-1;
            int n= outer.size();
            for(int j=start;j<n;j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(nums[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}

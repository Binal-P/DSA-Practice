package Day6;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    //Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.
    //
    //The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the
    //frequency
    // of at least one of the chosen numbers is different.
    //
    //The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        combinationSum(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    public void combinationSum(int index,int[] candidates,int target,List<List<Integer>> ans,List<Integer> current){
        if(index==candidates.length){
            if(target == 0){
                ans.add(new ArrayList<>(current));
            }
            return;
        }
        if(candidates[index]<=target){
            current.add(candidates[index]);
            combinationSum(index,candidates,target-candidates[index],ans,current);
            current.remove(current.size() -1);
        }
        combinationSum(index+1,candidates,target,ans,current);
    }
}

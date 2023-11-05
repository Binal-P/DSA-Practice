package Day5;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfArray {
    //Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
    public List<List<Integer>> permute(int[] nums) {
        return permute( nums,0,new ArrayList<>());
    }
    public List<List<Integer>> permute(int[] unprocessed, int currentIndex, List<Integer> processed){
        List<List<Integer>> ans = new ArrayList<>();
        if(currentIndex==unprocessed.length){
            List<Integer> list = new ArrayList<>();
            for(var item:processed){
                list.add(item);
            }
            ans.add(list);
            return ans;
        }
        int startIndex = 0;
        for(int i=0;i<= currentIndex;i++){
            List<Integer> newProcessed = new ArrayList<>();
            newProcessed.addAll(processed);
            newProcessed.add(startIndex, unprocessed[currentIndex]);
            List<List<Integer>> branchResult = permute(unprocessed,currentIndex+1,newProcessed);
            ans.addAll(branchResult);
            startIndex = startIndex+1;
        }
        return ans;

    }
}

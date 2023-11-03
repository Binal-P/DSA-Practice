package Recursion.RecursionPractice;

public class LinearSearch {
    public int search(int[] nums, int target){
        return search(nums,target,0);
    }

    private int search(int[] nums, int target, int start) {
        if(start> nums.length-1){
            return -1;
        }
        if(nums[start]==target){
            return start;
        } else{
            return search(nums,target,start+1);
        }
    }
}

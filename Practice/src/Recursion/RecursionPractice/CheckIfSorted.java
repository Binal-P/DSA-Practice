package Recursion.RecursionPractice;

public class CheckIfSorted {
    public boolean CheckIfArraySorted(int[] nums){
        return checkIfArraySorted(nums,0);
    }

    private boolean checkIfArraySorted(int[] nums, int currentIndex) {
        if(nums.length==1){
            return true;
        }
        if(currentIndex ==nums.length-1){
            return true;
        }
        return nums[currentIndex]<nums[currentIndex+1] && checkIfArraySorted(nums,currentIndex+1);
    }
}

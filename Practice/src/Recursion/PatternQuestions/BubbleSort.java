package Recursion.PatternQuestions;

public class BubbleSort {
    public int[] bubbleSort(int[] nums){
        return bubbleSort(nums,nums.length-1,0);
    }

    private int[] bubbleSort(int[] nums, int n, int start) {
        if(n==0){
            return nums;
        }
        if(start<n){
            if(nums[start]>nums[start+1]){
                int temp = nums[start+1];
                nums[start+1] = nums[start];
                nums[start] =temp;
            }
            bubbleSort(nums,n,start+1);
        }else{
            bubbleSort(nums,n-1,0);
        }
        return nums;
    }
}

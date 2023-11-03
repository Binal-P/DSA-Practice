package Recursion.PatternQuestions;

public class SelectionSort {
    public int[] selectionSort(int[] nums){
        return selectionSort(nums,nums.length-1,0,0);
    }

    private int[] selectionSort(int[] nums, int n, int start,int maximumIndex) {
        if(n==0){
            return nums;
        }
        if(start<n) {
            if (nums[start] > nums[maximumIndex]) {
                selectionSort(nums, n, start + 1, start);
            } else {
                selectionSort(nums, n, start, maximumIndex);
            }
        }else{
            int temp = nums[start+1];
            nums[start+1] = nums[start];
            nums[start] =temp;
            selectionSort(nums,n,0,0);
        }
        return nums;
    }
}

package Day5;

public class RotatedSortedArraySearch {
    public int search(int[] nums, int target) {
        //There is an integer array nums sorted in ascending order (with distinct values).
        //
        //Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
        //
        //Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
        //
        //You must write an algorithm with O(log n) runtime complexity.
        return search(nums,target,0,nums.length-1);
    }

    public int search(int[] nums, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(nums[m]==target){
            return m;
        }
        if(nums[s]<=nums[m]){
            if(target >= nums[s] && target <=nums[m]){
                return search(nums,target,s,m-1);
            } else {
                return search(nums, target,m+1,e);
            }
        }
        if(target >=nums[m] && target <=nums[e]){
            return search(nums, target, m+1,e);
        } else{
            return search(nums,target, s,m-1);
        }
    }
}

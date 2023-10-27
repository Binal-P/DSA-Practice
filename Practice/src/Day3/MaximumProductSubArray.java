package Day3;

public class MaximumProductSubArray {
    //Given an integer array nums, find a
    //subarray
    // that has the largest product, and return the product.
    //
    //The test cases are generated so that the answer will fit in a 32-bit integer.
    //TC:O(n)
    //SC:O(1)
    public int maxProduct(int[] nums) {
        int prefix = 1;
        int suffix = 1;
        int max = Integer.MIN_VALUE;
        int n= nums.length;
        for(int i=0;i<n;i++){
            if(prefix==0){
                prefix=1;
            }
            if(suffix==0){
                suffix=1;
            }
            prefix=prefix * nums[i];
            suffix = suffix * nums[n-i-1];
            max = Math.max(max,Math.max(prefix,suffix));
        }
        return max;
    }
}

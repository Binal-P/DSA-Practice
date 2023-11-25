package Day7;

import java.util.Arrays;

public class HouseRobberII {
    //You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses were broken into on the same night.
    //
    //Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
    public int rob(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }

        int[][] precompute = new int[nums.length][2];
        Arrays.stream(precompute).forEach(a -> Arrays.fill(a, -1));
        int max1 = rob(precompute, nums, 0, nums.length - 2, false);

        Arrays.stream(precompute).forEach(a -> Arrays.fill(a, -1));
        int max2 = rob(precompute, nums, 1, nums.length - 1, false);

        return Math.max(max1, max2);
    }
    public int rob(int[][] precompute,int[] nums,int currentIndex,int endIndex,boolean isPreviousRobbed){
        if(currentIndex > endIndex){
            return 0;
        }
        if(precompute[currentIndex][isPreviousRobbed?1:0]!= -1){
            return precompute[currentIndex][isPreviousRobbed ?1:0];
        }
        int robbedSum =0;
        if(isPreviousRobbed){
            return rob(precompute,nums,currentIndex +1,endIndex,false);
        } else{
            robbedSum = Math.max(nums[currentIndex] + rob(precompute, nums, currentIndex + 1,endIndex, true),rob(precompute, nums,currentIndex + 1,endIndex, false));
            precompute[currentIndex][isPreviousRobbed ? 1: 0] = robbedSum;
        }
        return robbedSum;
    }
}

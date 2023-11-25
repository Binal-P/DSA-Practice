package Day7;

import java.util.Arrays;

public class HouseRobber {
    //You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
    //
    //Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
    //Top down approach
    public int rob(int[] nums) {
        int[][] precompute = new int[nums.length][2];
        Arrays.stream(precompute).forEach(a -> Arrays.fill(a, -1));
        return rob(precompute, nums, nums.length - 1, false);
    }

    private int rob(int[][] precompute, int[] nums, int currentIndex, boolean isPreviousRobbed) {
        if(currentIndex < 0) {
            return 0;
        }

        if(precompute[currentIndex][isPreviousRobbed ? 1 : 0] != -1) {
            return precompute[currentIndex][isPreviousRobbed ? 1 : 0];
        }

        int robbedSum = 0;
        if(isPreviousRobbed) {
            return rob(precompute, nums, currentIndex - 1, false);
        }
        else {
            robbedSum = Math.max(
                    nums[currentIndex] + rob(precompute, nums, currentIndex - 1, true),
                    rob(precompute, nums, currentIndex - 1, false)
            );
            precompute[currentIndex][isPreviousRobbed ? 1 : 0] = robbedSum;
        }
        return robbedSum;
    }
}

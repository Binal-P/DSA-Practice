package Day8;

import java.util.Arrays;

public class JumpGame {
    //You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
    //
    //Return true if you can reach the last index, or false otherwise.
    //
    //
    //
    //Example 1:
    //
    //Input: nums = [2,3,1,1,4]
    //Output: true
    //Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
    public boolean canJump(int[] nums) {
        return canJump(nums,nums.length,0);
    }
    public boolean canJump(int[] nums,int n, int index){
        if(index==n-1){
            return true;
        }
        if(index>=n || nums[index]==0){
            return false;
        }

        //   for(int j=0;j<=nums[index];j++){
        return canJump(nums,n,index=index+nums[index]);

    }

    public boolean canJump1(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return bd(0,nums,dp);
    }
    boolean bd(int i,int nums[],int dp[]){
        if(i==nums.length-1){
            dp[i]=1;
            return true;
        }
        if(dp[i]!=-1){
            if(dp[i]==1){
                return true;
            }
            else{
                return false;
            }
        }

        for(int j=1;j<nums[i]+1;j++){
            if(i+j<nums.length){
                if(bd(i+j,nums,dp)){
                    dp[i]=1;
                    return true;
                }
            }
        }
        dp[i]=0;
        return false;
    }
}

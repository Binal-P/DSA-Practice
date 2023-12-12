package Day25;

import Day21.TreeNode;

public class SumOfLongestbloodLineTree {
    //https://www.geeksforgeeks.org/problems/sum-of-the-longest-bloodline-of-a-tree/1
    int maxSum=Integer.MIN_VALUE;
    int maxLevel =0;
    public int sumOfLongRootToLeafPath(TreeNode root)
    {
        if(root==null){
            return 0;
        }
        sumOfLongRootToLeafPath(root, 0,0);
        return maxSum;
    }

    public void sumOfLongRootToLeafPath(TreeNode root, int totalSum, int level){
        if(root==null){
            return ;
        }
        if(root.left==null && root.right==null){
            totalSum = totalSum+root.val;
            if(level>=maxLevel){
                if(level>maxLevel){
                    maxSum=0;
                }
                maxSum = Math.max(maxSum,totalSum);
                maxLevel = level;
            }
            totalSum = totalSum-root.val;
        }
        sumOfLongRootToLeafPath(root.left,totalSum+root.val,level+1);
        sumOfLongRootToLeafPath(root.right, totalSum+root.val, level+1);
        totalSum = totalSum-root.val;
    }
}

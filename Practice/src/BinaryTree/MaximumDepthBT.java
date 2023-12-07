package BinaryTree;

import Day21.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthBT {
    //Given the root of a binary tree, return its maximum depth.
    //
    //A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
    int len=0;
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            while(size>0){
                TreeNode curr =  q.poll();
                if(curr!=null){
                    if(curr.left!=null){
                        q.add(curr.left);
                    }
                    if(curr.right!=null){
                        q.add(curr.right);
                    }
                    size--;
                }
            }
            len++;
        }
        return len;
    }
}

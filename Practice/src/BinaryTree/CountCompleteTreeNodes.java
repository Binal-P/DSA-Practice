package BinaryTree;

import Day21.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class CountCompleteTreeNodes {
    //Given the root of a complete binary tree, return the number of the nodes in the tree.
    //
    //According to Wikipedia, every level, except possibly the last, is completely filled in a complete binary tree, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.
    //
    //Design an algorithm that runs in less than O(n) time complexity.
    //
    //
    int count=0;
    public int countNodesInOrder(TreeNode root){
        if(root==null){
            return 0;
        } else{
            TreeNode current = root;
            countNodesInOrder(current.left);
            count++;
            countNodesInOrder(current.right);
            return count;
        }
    }

    public int countNodesInPreOrder(TreeNode root){
        if(root==null){
            return 0;
        } else{
            TreeNode current = root;
            count++;
            countNodesInPreOrder(current.left);
            countNodesInPreOrder(current.right);
            return count;
        }
    }

    public int countNodesInPostOrder(TreeNode root){
        if(root==null){
            return 0;
        } else{
            TreeNode current = root;
            countNodesInPreOrder(current.left);
            countNodesInPreOrder(current.right);
            count++;
            return count;
        }
    }

    public int countNodesBFS(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int count =0;
        while(!queue.isEmpty()){
            TreeNode curr = queue.poll();
            count++;
            if(curr.left!=null)queue.add(curr.left);
            if(curr.right != null) queue.add(curr.right);
        }
        return count;
    }
}

package Day22;

import Day21.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class RightSideViewBinaryTree {
    //Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        f(root,0,res);
        return res;
    }
    public void f(TreeNode current, int level, List<Integer> res){
        if(current==null){
            return;
        }else if(level==res.size()){
            res.add(current.val);
        }
        f(current.right, level+1, res);
        f(current.left, level+1, res);
    }
}

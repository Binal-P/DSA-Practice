package Day21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ZigZagLevelOrderTraversal {
    //Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).
    //Input: root = [3,9,20,null,null,15,7]
    //Output: [[3],[20,9],[15,7]]
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(0, root, res);
        for(int i=1; i<res.size(); i+=2){
            Collections.reverse(res.get(i));
        }
        return res;
    }
    private void dfs(int lvl, TreeNode node, List<List<Integer>> res){
        if(node==null)
            return;

        if(res.size()<lvl+1){
            List<Integer> list = new ArrayList<>();
            list.add(node.val);
            res.add(list);
        }
        else{
            res.get(lvl).add(node.val);
        }
        lvl++;
        dfs(lvl, node.left, res);
        dfs(lvl, node.right, res);
    }

}

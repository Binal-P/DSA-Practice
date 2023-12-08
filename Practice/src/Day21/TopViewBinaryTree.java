package Day21;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class TopViewBinaryTree {
    //Given below is a binary tree. The task is to print the top view of binary tree. Top view of a binary tree is the set of nodes visible when the tree is viewed from the top. For the given below tree
    //https://www.geeksforgeeks.org/problems/top-view-of-binary-tree/1?

    static ArrayList<Integer> topView(TreeNode root)
    {
        Map<Integer, int[]> columnTable = new TreeMap<>();
        ArrayList<Integer> output = new ArrayList<>();
        if(root==null){
            return output;
        }
        BFS(root, columnTable, 0,0 );
        for(int key:columnTable.keySet()){
            output.add(columnTable.get(key)[0]);
        }
        return output;

    }
    static void BFS(TreeNode root, Map<Integer,int[]> columnTable, int col, int level){
        if(root==null){
            return;
        }
        if(columnTable.get(col)==null ||columnTable.get(col)[1]>level){
            columnTable.put(col,new int[] {root.val,level});
        }
        BFS(root.left,columnTable,col-1,level+1);
        BFS(root.right,columnTable, col+1, level+1);
    }
}

package Day21;

import javafx.util.Pair;

import java.util.*;

public class VerticalBinaryTraversal {
    //Given the root of a binary tree, calculate the vertical order traversal of the binary tree.
    //
    //For each node at position (row, col), its left and right children will be at positions (row + 1, col - 1) and (row + 1, col + 1) respectively. The root of the tree is at (0, 0).
    //
    //The vertical order traversal of a binary tree is a list of top-to-bottom orderings for each column index starting from the leftmost column and ending on the rightmost column. There may be multiple nodes in the same row and same column. In such a case, sort these nodes by their values.
    //
    //Return the vertical order traversal of the binary tree.
        Map<Integer, ArrayList<Pair<Integer,Integer>>> columnTable = new HashMap();
        int minCol =0;
        int maxCol = 0;
        public List<List<Integer>> verticalTraversal(TreeNode root) {

            List<List<Integer>> output = new ArrayList<>();
            if(root==null){
                return output;
            }
            this.BFS(root);
            for(int i=minCol;i<maxCol+1;i++){
                Collections.sort(columnTable.get(i),new Comparator<Pair<Integer,Integer>> (){
                    @Override
                    public int compare(Pair<Integer,Integer> p1,Pair<Integer, Integer> p2){
                        if(p1.getKey().equals(p2.getKey())){
                            return p1.getValue() - p2.getValue();
                        }else{
                            return p1.getKey() - p2.getKey();
                        }
                    }
                });
                List<Integer> sortedColumn = new ArrayList();
                for (Pair<Integer, Integer> p : columnTable.get(i)) {
                    sortedColumn.add(p.getValue());
                }
                output.add(sortedColumn);
            }

            return output;
        }
        public void BFS(TreeNode root) {

            Queue<Pair<TreeNode, Pair<Integer, Integer>>> queue = new ArrayDeque();
            int row = 0;
            int column = 0;
            queue.offer(new Pair(root, new Pair(row, column)));
            while (!queue.isEmpty()) {
                Pair<TreeNode, Pair<Integer, Integer>> p = queue.poll();
                root = p.getKey();
                row = p.getValue().getKey();
                column = p.getValue().getValue();
                if (root != null) {
                    if (!columnTable.containsKey(column)) {
                        columnTable.put(column, new ArrayList<Pair<Integer, Integer>>());
                    }
                    columnTable.get(column).add(new Pair<>(row, root.val));
                    minCol = Math.min(minCol, column);
                    maxCol = Math.max(maxCol, column);
                    queue.offer(new Pair(root.left, new Pair(row + 1, column - 1)));
                    queue.offer(new Pair(root.right, new Pair(row + 1, column + 1)));
                }
            }
        }
}

package Day10;

public class SetMatrixZero {
    //Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
    //
    //You must do it in place.
    //
    //Example 1:
    //
    //Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
    //Output: [[1,0,1],[0,0,0],[1,0,1]]
    public void setZeroes(int[][] matrix) {
        setZeroes(matrix,0,0);
    }
    public void setZeroes(int[][] matrix, int row, int col){
        if(col>=matrix.length){
            return;
        }
        if(row>= matrix[0].length){
            setZeroes(matrix,0,col+1);
            return;
        }

        int isZero =0;
        if(matrix[col][row]==0){
            isZero=1;
        }
        setZeroes(matrix,row+1,col);
        if(isZero==1){
            for(int i=0;i<matrix.length;i++){
                matrix[i][row]=0;
            }
            for(int i=0;i<matrix[0].length;i++){
                matrix[col][i] =0;
            }
        }
    }
}

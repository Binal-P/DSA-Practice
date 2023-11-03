package Recursion.PatternQuestions;

public class PrintStarPattern {
    public void printTriangleInverse(int row, int col){
        if(row==0){
            return;
        }
        if(col<row){
            System.out.println("*");
            printTriangleInverse(row, col+1);
        } else{
            System.out.println("*");
            printTriangleInverse(row-1,0);
        }
    }

    public void printTriangleI(int row, int col){
        if(row==0){
            return;
        }
        if(col<row){
            printTriangleInverse(row, col+1);
            System.out.println("*");
        } else{
            printTriangleInverse(row-1,0);
            System.out.println("*");
        }
    }
}

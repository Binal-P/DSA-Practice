package Recursion.EasyProblems;

public class Print1to5 {
    public void printNum(int n){
        if(n==0) {
            return;
        }
        printNum(n - 1);
        System.out.println(n);
    }
}

package Recursion.EasyProblems;

public class Print5to1 {
    public void printNum(int n){
        if(n==0) {
            return;
        }
            System.out.println(n);
            printNum(n - 1);
    }
}

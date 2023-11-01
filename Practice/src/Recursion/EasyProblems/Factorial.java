package Recursion.EasyProblems;

public class Factorial {
    public int findFactorail(int n){
        if(n==1){
            return 1;
        }
        return n*findFactorail(n-1);
    }
}

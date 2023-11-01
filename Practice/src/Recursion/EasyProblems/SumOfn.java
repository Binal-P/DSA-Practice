package Recursion.EasyProblems;

public class SumOfn {
    public int sumOfNNumbers(int n){
        if (n<=1){
            return 1;
        }
        return n + sumOfNNumbers(n-1);
    }
}

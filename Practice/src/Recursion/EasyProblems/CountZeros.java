package Recursion.EasyProblems;

public class CountZeros {
    int count=0;
    public int countZero(int num){
        int count=0;
        return countZero(num , count);
    }
    public int countZero(int n, int count){
        if(n%10==n && n==0){
            return count;
        }
        int remainder = n%10;
        if(remainder==0){
            return countZero(n/10,count+1);
        }
        return countZero(n/10,count);
    }
}

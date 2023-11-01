package Recursion.EasyProblems;

public class ReverseANumber {
    int sum =0;
    public void reverseNum(int n){

        if(n==0){
            return;
        }
        int remainder = n%10;
        sum = sum *10 +remainder;
        reverseNum(n/10);
        System.out.println(sum);
    }

    public int rev2(int num){
        int digits = (int)(Math.log10(num))+1;
        return helper(num,digits);
    }
    public int helper(int n, int digit){
        if(n%10==n){
            return n;
        }
        int remainder  = n %10;
        return remainder * (int)Math.pow(10, digit-1) +helper(n/10,digit-1);
    }
}

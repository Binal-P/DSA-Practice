package Recursion.EasyProblems;

public class palindrome {
    public boolean palindrome(int num){
        ReverseANumber r = new ReverseANumber();
        return(num==r.rev2(num));
    }
}

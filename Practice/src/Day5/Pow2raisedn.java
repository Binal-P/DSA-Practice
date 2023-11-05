package Day5;

public class Pow2raisedn {
    //Given an integer n, return true if it is a power of two. Otherwise, return false.
    //
    //An integer n is a power of two, if there exists an integer x such that n == 2x.
    public boolean isPowerOfTwo(int n) {

        return f(n);
    }
    public boolean f(int n){
        if(n==0)
            return false;
        if(n==1){
            return true;
        } else{
            return(n%2==0 && f(n/2));
        }
    }
}

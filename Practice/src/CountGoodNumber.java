public class CountGoodNumber {
    public int MOD  = 1000000007;
    public int countGoodNumbers(long n){
        long odd = n/2;
        long even = (n/2)+(n%2);
        return(int)(pow(5,even)%MOD *pow(4,odd)%MOD)%MOD;
    }

    private long pow(long i, long n) {
        if(n==0){
            return 1;
        }
        long temp = pow(i,n/2);
        if(n%2==0) {
            return (temp * temp) % MOD;
        } else{
            return (i * temp *temp) % MOD;
        }
    }
}

import Recursion.EasyProblems.*;
import Recursion.FibonacciNumbers;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        FibonacciNumbers fib = new FibonacciNumbers();
        int val = fib.fibonacci(5);
        System.out.println(val);
        Print5to1 pr = new Print5to1();
        pr.printNum(5);
        Print1to5 pr1 = new Print1to5();
        pr1.printNum(5);
        Factorial f = new Factorial();
        int factorail = f.findFactorail(5);
        System.out.println(factorail);
        SumOfDigits sod = new SumOfDigits();
        int sum = sod.sumOfDigits(1342);
        System.out.println(sum);
        ProductOfDigits pod = new ProductOfDigits();
        int product = pod.productOfDigits(1342);
        System.out.println(product);
        ReverseANumber rnum = new ReverseANumber();
       rnum.reverseNum(1824);
       int result = rnum.rev2(1234);
        System.out.println(result);
    }
}
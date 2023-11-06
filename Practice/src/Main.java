import Day7.LongestSubstringWithoutRepeating;
import Day8.JumpGame;
import Recursion.EasyProblems.*;
import Recursion.FibonacciNumbers;
import Recursion.Permutations.AllPermutationOfString;
import Recursion.SubsetSubsequenceString.AllCombinationofString;
import Recursion.SubsetSubsequenceString.Iterative.AllCombinationOfIntegerInArray;
import Recursion.SubsetSubsequenceString.Iterative.AllcombinationOfDuplicateIntegerInArray;
import Recursion.SubsetSubsequenceString.NewStringSkippingChar;

import java.util.List;

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
        CountZeros countZeros = new CountZeros();
        int num = countZeros.countZero(1020405);
        System.out.println(num);
        NewStringSkippingChar skip = new NewStringSkippingChar();
        skip.getNewString("baccdah");
        String strstr = skip.getNewString1("baccadah");
        System.out.println(strstr);
        String skipApple = skip.skipApple("bcappledf");
        System.out.println(skipApple);
        String skipAppNotApple = skip.skipAppNotApple("baappcappledah");
        System.out.println(skipAppNotApple);
        AllCombinationofString all = new AllCombinationofString();
        all.getAllCombinations("","abc");
        int[] nums = {1,2,3};
        AllCombinationOfIntegerInArray all1 = new AllCombinationOfIntegerInArray();
        List<List<Integer>> anssorted= all1.getAllSubsets(nums);
//        for(List<Integer> res:anssorted){
//            System.out.println(res);
//        }
        int[] array = {1,2,2};
        AllcombinationOfDuplicateIntegerInArray all2 = new AllcombinationOfDuplicateIntegerInArray();
        List<List<Integer>> ass = all2.getAllSubsets(array);
        ass.forEach(System.out::println);
        AllPermutationOfString allper = new AllPermutationOfString();
//        allper.allPermutaions("abc");
        System.out.println("Here");
        List<String> ans = allper.allPermutaionsList("abc");
         System.out.println(ans);
        int anssss = allper.allPermutaionsCount("abcd");
        System.out.println(anssss);
        CountGoodNumber count = new CountGoodNumber();
        int total =count.countGoodNumbers(5);
        System.out.println(total);
        LongestSubstringWithoutRepeating len = new LongestSubstringWithoutRepeating();
        int length = len.lengthOfLongestSubString("abcabcbb");
        int[] jump = {2,3,1,1,4};
        JumpGame jump1 = new JumpGame();
        boolean isReachable = jump1.canJump(jump);
    }
}
package Recursion.EasyProblems;

public class NumberOfSteps {
    //Given an integer num, return the number of steps to reduce it to zero.
    //
    //In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
    public int numberOfSteps(int num) {
        return numberOfSteps(num,0);
    }
    public int numberOfSteps(int num, int count){
        if(num==0){
            return count;
        }
        if(num%2==0){
            return numberOfSteps(num/2,count+1);
        } else{
            return numberOfSteps(num-1,count+1);
        }
    }
}

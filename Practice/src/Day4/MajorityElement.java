package Day4;

public class MajorityElement {
    //Given an array nums of size n, return the majority element.
    //
    //The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
    //
    // TC: O(n)
    // SC: O(1)
    public int majorityElement(int[] nums) {
        int element = nums[0];
        int count =1;
        for(int i=0; i< nums.length;i++){
            if(nums[i]!=element){
                count--;
            } else{
                count++;
            }
            if(count==0){
                count =1;
                element = nums[i];
            }
        }
        return element;
    }
}

package Day14;

import java.util.HashMap;

public class CountNumberGivenXOR {
    //https://www.geeksforgeeks.org/count-number-subarrays-given-xor/
    //Given an array of integers arr[] and a number m, count the number of subarrays having XOR of their elements as m.
    //Examples:
    //
    //Input : arr[] = {4, 2, 2, 6, 4}, m = 6
    //Output : 4
    //Explanation : The subarrays having XOR of
    //              their elements as 6 are {4, 2},
    //              {4, 2, 2, 6, 4}, {2, 2, 6},
    //               and {6}
    static int subarrayXor(int[] arr, int n, int m)
    {

        // declaring the hashtable
        // and initializing it with a count of 1
        // for 0
        HashMap<Integer, Integer> HashTable
                = new HashMap<>();

        HashTable.put(0, 1);
        int count = 0, curSum = 0;
        for (int i = 0; i < n; i++) {
            curSum ^= arr[i];
            if (HashTable.containsKey(curSum ^ m))
                count += HashTable.get(curSum ^ m);
            if (!HashTable.containsKey(curSum))
                HashTable.put(curSum, 0);
            HashTable.put(curSum,
                    HashTable.get(curSum) + 1);
        }
        return (count);
    }
}

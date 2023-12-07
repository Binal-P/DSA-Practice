package Day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RussianDollEnvelope {
    //You are given a 2D array of integers envelopes where envelopes[i] = [wi, hi] represents the width and the height of an envelope.
    //
    //One envelope can fit into another if and only if both the width and height of one envelope are greater than the other envelope's width and height.
    //
    //Return the maximum number of envelopes you can Russian doll (i.e., put one inside the other).
    //
    //Note: You cannot rotate an envelope.
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b)->
                a[0]==b[0]?(b[1]-a[1]):(a[0]-b[0])
        );
        int n = envelopes.length;
        List<int[]> temp = new ArrayList<>();
        for(int i=0;i<n;i++){
            int location = BS(temp,envelopes[i]);
            if(location == temp.size()){
                temp.add(envelopes[i]);
            } else{
                temp.set(location,envelopes[i]);
            }
        }
        return temp.size();
    }

    public int BS(List<int[]> envelopes,int[] target){
        int low=0, high=envelopes.size()-1;
        while(low<=high){
            int mid=(low+high)/2;
            int[] envelope=envelopes.get(mid);
            if(envelope[1]==target[1])return mid;
            else if(envelope[1]<target[1])low=mid+1;
            else high=mid-1;
        }
        return low;
    }
}

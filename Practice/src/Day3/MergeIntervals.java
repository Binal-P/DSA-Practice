package Day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    //Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
    //TC:O(nlogN +n)
    //SC: O(1)
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, Comparator.<int[]>comparingInt(a->a[0]).thenComparing(a->a[1]));
        List<int[]> ans  = new ArrayList<>();
        for(int[] interval:intervals){
            if(ans.isEmpty() || interval[0]>ans.get(ans.size()-1)[1]){
                ans.add(interval);
            } else{
                ans.get(ans.size()-1)[1] = Math.max(interval[1],ans.get(ans.size()-1)[1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}

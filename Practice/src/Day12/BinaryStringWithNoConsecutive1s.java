package Day12;

import java.util.ArrayList;
import java.util.List;

public class BinaryStringWithNoConsecutive1s {
    //https://www.codingninjas.com/studio/problems/binary-strings-with-no-consecutive-1s_893001?leftPanelTabValue=PROBLEM
    public List< String > generateString(int N) {
        List<String> ans = new ArrayList<>();
        rec(ans,"",N);
        return ans;
    }
    public void rec(List<String> strs, String s, int n){
        if(s.length()>n){
            return;
        }
        if(s.length()==n){
            strs.add(s);
        }
        rec(strs,s+'0',n);
        if(s.isEmpty()||s.charAt(s.length()-1)!='1'){
            rec(strs, s+'1', n);
        }
    }
}

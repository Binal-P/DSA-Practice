package Recursion.SubsetSubsequenceString;

import java.util.ArrayList;
import java.util.List;

public class AllSubsetOfString {
    public List<String> subsetRet(String p,String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        List<String> left = subsetRet(p+ch,up.substring(1));
        List<String> right = subsetRet(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}

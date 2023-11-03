package Recursion.SubsetSubsequenceString;

import java.util.ArrayList;
import java.util.List;

public class AllSubsetOfStringWithAscii {
    public void subsetRetWithAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);
        subsetRetWithAscii(p+ch,up.substring(1));
        subsetRetWithAscii(p,up.substring(1));
        subsetRetWithAscii(p+(ch+0),up.substring(1));
    }

    public List<String> subsetRetWithAsciiRet(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        List<String> first =subsetRetWithAsciiRet(p+ch,up.substring(1));
        List<String> second =subsetRetWithAsciiRet(p,up.substring(1));
        List<String> third =subsetRetWithAsciiRet(p+(ch+0),up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}

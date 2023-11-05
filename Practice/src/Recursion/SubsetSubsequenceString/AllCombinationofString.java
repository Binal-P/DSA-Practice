package Recursion.SubsetSubsequenceString;

import java.util.ArrayList;
import java.util.List;

public class AllCombinationofString {
    public void getAllCombinations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        getAllCombinations(p+ch, up.substring(1));
        getAllCombinations(p,up.substring(1));
    }

}

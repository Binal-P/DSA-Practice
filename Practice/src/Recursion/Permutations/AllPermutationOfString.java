package Recursion.Permutations;

import java.util.ArrayList;
import java.util.List;

public class AllPermutationOfString {
     public void allPermutaions(String str){
         allPermutaions("", str);
     }

    private void allPermutaions(String p, String up) {
         if(up.isEmpty()){
             System.out.println(p);
             return;
         }
         char ch = up.charAt(0);
         for(int i=0;i<=p.length();i++){
             String first = p.substring(0,i);
             String second = p.substring(i,p.length());
             allPermutaions(first + ch + second,up.substring(1));
         }
    }

    public List<String> allPermutaionsList(String str){
        return allPermutaionsList("", str);
    }

    private List<String> allPermutaionsList(String p, String up) {
        if(up.isEmpty()){
            List<String> s = new ArrayList<>();
            s.add(p);
            return s;
        }
        char ch = up.charAt(0);
        List<String> ans = new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            ans.addAll(allPermutaionsList(first + ch + second,up.substring(1)));
        }
        return ans;
    }

    public int allPermutaionsCount(String str){
       return allPermutaionsCount("", str);
    }

    private int allPermutaionsCount(String p, String up) {
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            count =count + allPermutaionsCount(first + ch + second,up.substring(1));
        }
        return count;
    }
}

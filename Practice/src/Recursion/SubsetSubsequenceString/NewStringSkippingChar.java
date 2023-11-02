package Recursion.SubsetSubsequenceString;

public class NewStringSkippingChar {
    public void getNewString(String str){
         getNewString("",str);
    }
    public void getNewString(String p, String up ){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if(ch =='a'){
            getNewString(p,up.substring(1));
        } else {
            getNewString(p+ch,up.substring(1));
        }
    }

    //Approach by returning a string
    public String getNewString1(String up ){

        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);
        if(ch =='a'){
            return getNewString1(up.substring(1));
        } else {
            return ch + getNewString1(up.substring(1));
        }
    }

    public String skipApple(String up){
        if(up.isEmpty()) {
            return "";
        }

        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        } else{
            return up.charAt(0) + skipApple(up.substring(1));
        }

    }

    public String skipAppNotApple(String up){
        if(up.isEmpty()) {
            return "";
        }

        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        } else{
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }

    }
}

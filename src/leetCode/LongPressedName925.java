package leetCode;

import java.util.HashMap;

public class LongPressedName925 {
    public boolean isLongPressedName(String name, String typed) {
        //
        int i = 0;
        int j = 0;

        while(j < typed.length()){
            if(i < name.length() && name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }else if(j != 0 && typed.charAt(j) == name.charAt(i-1)){
                j++;
            }else{
                return false;
            }
        }
        return i == name.length();
    }

    public static void main(String[] args) {
        LongPressedName925 l = new LongPressedName925();
        System.out.println(l.isLongPressedName("saeed", "ssaaedd"));//false
        System.out.println(l.isLongPressedName("alex", "aaleex"));//true
    }
}

package leetCode;

public class DetectCapital520 {
    public boolean detectCapitalUse(String word) {
        //

        return false;
    }

    public static void main(String[] args) {
        DetectCapital520 d = new DetectCapital520();
        System.out.println(d.detectCapitalUse("USA"));//true
        System.out.println(d.detectCapitalUse("leetcode"));//true
        System.out.println(d.detectCapitalUse("Google"));//true
        System.out.println(d.detectCapitalUse("FlaG"));//false
    }
}

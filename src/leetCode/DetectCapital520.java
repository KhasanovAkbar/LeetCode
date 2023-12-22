package leetCode;

public class DetectCapital520 {
    public boolean detectCapitalUse(String word) {
        //
        if (word.length() == 1) return true;
        return (word.substring(1).equals(word.substring(1).toLowerCase())
                || (word.substring(0, 1).equals(word.substring(0, 1).toUpperCase()) && word.substring(1).equals(word.substring(1).toUpperCase())));
    }

    public static void main(String[] args) {
        DetectCapital520 d = new DetectCapital520();
        System.out.println(d.detectCapitalUse("USA"));//true
        System.out.println(d.detectCapitalUse("leetcode"));//true
        System.out.println(d.detectCapitalUse("Google"));//true
        System.out.println(d.detectCapitalUse("fA"));//false
        System.out.println(d.detectCapitalUse("FlaG"));//false
    }
}

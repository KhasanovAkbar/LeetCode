package leetCode;

public class ValidPalindrome125 {
    public boolean isPalindrome(String s) {
        //
        if (s.trim().length() == 0) return true;
        char[] charArray = s.toLowerCase().trim().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char item : charArray) {
            if (Character.isAlphabetic(item) || Character.isDigit(item))
                sb.append(item);
        }
        String string1 = sb.toString();
        String string2 = sb.reverse().toString();
        return string1.equals(string2);
    }

    public static void main(String[] args) {
        ValidPalindrome125 v = new ValidPalindrome125();
//        System.out.println(v.isPalindrome("A man, a plan, a canal: Panama"));//true
//        System.out.println(v.isPalindrome("race a car"));//false
        System.out.println(v.isPalindrome("0P"));//false
    }
}

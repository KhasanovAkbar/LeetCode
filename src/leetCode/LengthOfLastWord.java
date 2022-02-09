package leetCode;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int letter = 0;
        for (int i = s.length() -1; i >=0; i--) {
            boolean equals = s.charAt(i) == ' ';
            if (!equals) letter++;
            else break;
        }
        return letter;
    /*    String trim = s.trim();
        int res = 0;
        StringBuilder stringBuilder = new StringBuilder(trim).reverse();
        String s1 = stringBuilder.toString();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != ' ') res++;
            else break;
        }
        return res;*/

    }
}

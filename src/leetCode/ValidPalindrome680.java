package leetCode;

public class ValidPalindrome680 {
    public boolean validPalindrome(String s) {
        //
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
            i++;
            j--;
        }

        return true;

       /* StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s, 0, i).append(s.substring(i + 1));

            String string1 = sb.toString();
            String string2 = sb.reverse().toString();
            if (string1.equals(string2)) {
                isPalindrome = true;
                break;
            } else
                sb = new StringBuilder();
        }*/
    }

    private boolean isPalindrome(String s, int i, int j) {

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }


    public static void main(String[] args) {
        ValidPalindrome680 v = new ValidPalindrome680();
        System.out.println(v.validPalindrome("aba"));//true
        System.out.println(v.validPalindrome("abca"));//true
        System.out.println(v.validPalindrome("abc"));//false
        System.out.println(v.validPalindrome("recce"));//true
    }
}

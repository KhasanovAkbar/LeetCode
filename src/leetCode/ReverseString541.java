package leetCode;

public class ReverseString541 {
    public String reverseStr(String s, int k) {
        //
        if (s == null || s.length() == 0 || k == 0) {
            return "";
        }
        int i = 0;
        StringBuilder sb = new StringBuilder(s);
        while (i < s.length()) {
            int left = i;
            int right = Math.min(i + k - 1, s.length() - 1);
            while (left < right) {
                char a = sb.charAt(left);
                char b = sb.charAt(right);
                sb.setCharAt(left, b);
                sb.setCharAt(right, a);
                left ++;
                right --;
            }
            i = i + 2 * k;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ReverseString541 r = new ReverseString541();
        System.out.println(r.reverseStr("abcdefg", 2));//bacdfeg
    }
}

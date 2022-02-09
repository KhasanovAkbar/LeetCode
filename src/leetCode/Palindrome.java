package leetCode;

import javax.swing.text.html.parser.Parser;

public class Palindrome {
    public boolean isPalindrome(int x) {
        String s1 = String.valueOf(x);
        StringBuffer s = new StringBuffer(s1);
        StringBuffer reverse = s.reverse();
        return reverse.toString().equals(s1);
    }
}


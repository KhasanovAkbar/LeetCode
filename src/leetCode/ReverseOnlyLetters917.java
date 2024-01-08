package leetCode;

import java.util.Arrays;

public class ReverseOnlyLetters917 {
    public String reverseOnlyLetters(String s) {
        //
        StringBuilder sb = new StringBuilder();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (Character.isAlphabetic(c))
                sb.append(c);
        }
        sb.reverse();
        char[] reversedCharArray = sb.toString().toCharArray();
        int temp = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isAlphabetic(charArray[i])) {
                charArray[i] = reversedCharArray[temp];
                temp++;
            }
        }
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        ReverseOnlyLetters917 r = new ReverseOnlyLetters917();
        System.out.println(r.reverseOnlyLetters("Test1ng-Leet=code-Q!"));//Qedo1ct-eeLg=ntse-T!
    }
}

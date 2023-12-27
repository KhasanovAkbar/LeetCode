package leetCode;

import java.util.Arrays;

public class ReverseWordsInStringThree {
    public String reverseWords(String s) {
        //
        StringBuilder result = new StringBuilder();
        String[] split = s.split(" ");
        for (String value : split) {
            int begin = 0;
            int end = value.length() - 1;
            char[] wordArray = value.toCharArray();
            while (begin < end) {
                char temp = wordArray[begin];
                wordArray[begin] = wordArray[end];
                wordArray[end] = temp;
                begin++;
                end--;
            }
            result.append(String.valueOf(wordArray)).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        ReverseWordsInStringThree r = new ReverseWordsInStringThree();
        System.out.println(r.reverseWords("Let's take LeetCode contest")); //s'teL ekat edoCteeL tsetnoc
    }
}

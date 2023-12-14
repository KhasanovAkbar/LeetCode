package leetCode;

import java.util.HashMap;

public class ExcelSheetColumnNumber171 {
    public int titleToNumber(String columnTitle) {
        //
        int result = 0;
        HashMap<Character, Integer> alphabet = new HashMap<>();
        for (char i = 'A'; i <= 'Z'; i++) {
            alphabet.put(i, (int) i - 65 + 1);
        }
        StringBuilder reverseStr = new StringBuilder();
        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            reverseStr.insert(0, ch);
        }
        char[] charArray = reverseStr.toString().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            result+=Math.pow(26, i)*alphabet.get(charArray[i]);
        }
            return result;
    }

    public static void main(String[] args) {
        ExcelSheetColumnNumber171 e = new ExcelSheetColumnNumber171();
        System.out.println(e.titleToNumber("AY"));
    }
}

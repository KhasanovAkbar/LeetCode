package leetCode;

import java.util.HashMap;

public class ExcelSheetColumnTitle168 {
    public String convertToTitle(int columnNumber) {
        //
        StringBuilder result = new StringBuilder();
        HashMap<Integer, Character> alphabets = new HashMap<>();
        alphabets.put(0, 'Z');
        for (int i = 1; i <= 26; i++) {
            char c = (char) (i + 65 - 1);
            alphabets.put(i, c);
        }
        while (columnNumber > 26) {
            int ceil = columnNumber % 26;
            if (ceil == 0) columnNumber = columnNumber / 26 - 1;
            else columnNumber = columnNumber / 26;
            Character character = alphabets.get(ceil);
            result.insert(0, character);
        }

        result.insert(0, alphabets.get(columnNumber));


        return result.toString();
    }

    public static void main(String[] args) {
        ExcelSheetColumnTitle168 e = new ExcelSheetColumnTitle168();
        System.out.println(e.convertToTitle(701)); // ZY
        System.out.println(e.convertToTitle(28)); // AB
        System.out.println(e.convertToTitle(52)); // AZ
    }
}

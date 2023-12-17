package leetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LetterCombinationsOfPhoneNumber17 {
    public List<String> letterCombinations(String digits) {
        //
        String[] table = {"0", "1", "abc", "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz"};
        return letterCombinationsUtil(digits, table);
    }

    private ArrayList<String> letterCombinationsUtil(String digits, String[] table) {
        //
        if (digits.isEmpty()) return new ArrayList<>();
        char[] charArray = digits.toCharArray();
        ArrayList<Integer> numArray = new ArrayList<>();
        for (char c : charArray)
            numArray.add(c - '0');

        ArrayList<String> list = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("");
        while (!queue.isEmpty()) {
            String removeLetter = queue.remove();

            if (removeLetter.length() == numArray.size())
                list.add(removeLetter);
            else {
                String val = table[numArray.get(removeLetter.length())];
                for (int i = 0; i < val.length(); i++)
                    queue.add(removeLetter + val.charAt(i));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        LetterCombinationsOfPhoneNumber17 l = new LetterCombinationsOfPhoneNumber17();
        System.out.println(l.letterCombinations("")); //["ad","ae","af","bd","be","bf","cd","ce","cf"]
    }
}

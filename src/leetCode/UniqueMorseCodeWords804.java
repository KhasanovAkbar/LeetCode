package leetCode;

import java.util.HashMap;

public class UniqueMorseCodeWords804 {
    public int uniqueMorseRepresentations(String[] words) {
        //
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashMap<Character, String> morseHash = new HashMap<>();
        HashMap<String, Integer> resultHash = new HashMap<>();
        int index = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            morseHash.put(i, morse[index]);
            index++;
        }
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            char[] charArray = word.toCharArray();
            for (char c : charArray) {
                sb.append(morseHash.get(c));
            }
            resultHash.put(sb.toString(), resultHash.getOrDefault(sb.toString(), 0) + 1);
            sb = new StringBuilder();
        }
        return resultHash.size();
    }

    public static void main(String[] args) {
        UniqueMorseCodeWords804 u = new UniqueMorseCodeWords804();
        String[] str = {"gin", "zen", "gig", "msg"};
        System.out.println(u.uniqueMorseRepresentations(str));//2
    }
}

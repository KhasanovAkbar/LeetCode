package leetCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class ShortestCompletingWord748 {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        //
        Arrays.sort(words, Comparator.comparingInt(String::length));
        int[] arr = createCharCountArray(licensePlate.toLowerCase());
        String result = "";
        for (String word : words) {
            if (isMatch(word, arr)) {
                result = word;
                break;
            }
        }
        return result;
    }

    int[] createCharCountArray(String s) {
        int[] arr = new int[26];
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                arr[ch - 'a']++;
            }
        }
        return arr;
    }

    boolean isMatch(String word, int[] arr) {
        int[] cnt = createCharCountArray(word);
        for (int i = 0; i < 26; i++) {
            if (cnt[i] < arr[i]) {
                return false;
            }
        }
        return true;
       /* Arrays.sort(words, Comparator.comparingInt(String::length));
        StringBuilder letters = new StringBuilder();
        licensePlate = licensePlate.toLowerCase();
        HashMap<Character, Integer> letterHash = new HashMap<>();
        for (int i = 0; i < licensePlate.length(); i++) {
            if (Character.isAlphabetic(licensePlate.charAt(i)))
                letterHash.put(licensePlate.charAt(i), letterHash.getOrDefault(licensePlate.charAt(i), 0) + 1);
        }

        for (int i = 0; i < words.length; i++) {
            HashMap<Character, Integer> hashMap = new HashMap<>();
            if (words[i].length() >= letters.length()) {
                for (int j = 0; j < words[i].length(); j++) {
                    char c = words[i].charAt(j);
                    hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
                }
                List<Character> collect = letterHash.keySet().stream().toList();
                int count = 0;
                for (Character character : collect) {
                    if (hashMap.getOrDefault(character, 0) >= letterHash.get(character))
                        count++;
                }
                if (count == letterHash.size())
                    return words[i];
            }
        }
        return "";*/
    }

    public static void main(String[] args) {
        ShortestCompletingWord748 s = new ShortestCompletingWord748();
//        String[] strings = {"stepple", "step", "steps", "stripe"};
        String[] strings = {"suggest","letter","of","husband","easy","education","drug","prevent","writer","old"};
//        System.out.println(s.shortestCompletingWord("1s3 PSt", strings));//steps
        System.out.println(s.shortestCompletingWord("Ah71752", strings));//steps
    }
}

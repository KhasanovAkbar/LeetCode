package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UncommonWordsFromTwoSentences884 {
    public String[] uncommonFromSentences(String s1, String s2) {
        //
        HashMap<String, Integer> hashMap = new HashMap<>();
        List<String> result = new ArrayList<>();
        String[] split1 = s1.split(" ");
        String[] split2 = s2.split(" ");
        for (String item1 : split1) {
            hashMap.put(item1, hashMap.getOrDefault(item1, 0) + 1);
        }
        for (String item2 : split2) {
            hashMap.put(item2, hashMap.getOrDefault(item2, 0) + 1);
        }
        List<String> collect = hashMap.keySet().stream().toList();

        for (String s : collect) {
            if (hashMap.get(s) == 1)
                result.add(s);
        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        UncommonWordsFromTwoSentences884 u = new UncommonWordsFromTwoSentences884();
        String[] strings = u.uncommonFromSentences("this apple is", "this apple is");
        for (String string : strings) {
            System.out.print(string + " ");
        }
    }
}

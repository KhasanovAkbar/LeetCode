package leetCode;

import java.util.HashMap;

public class GoatLatin824 {
    public String toGoatLatin(String sentence) {
        //
        HashMap<Character, Integer> vowel = new HashMap<>();
        vowel.put('a', 1);
        vowel.put('e', 1);
        vowel.put('i', 1);
        vowel.put('o', 1);
        vowel.put('u', 1);
        String[] split = sentence.split(" ");
        for (int i = 0; i < split.length; i++) {
           if (vowel.get(split[i].toLowerCase().charAt(0))!=null){
                int index = 0;
                StringBuilder temp = new StringBuilder("ma");
                while (index < (i + 1)) {
                    temp.append("a");
                    index++;
                }
                split[i] += temp;
            } else {
                if (split[i].length() < 2) {
                    int index = 0;
                    StringBuilder temp = new StringBuilder("ma");
                    while (index < (i + 1)) {
                        temp.append("a");
                        index++;
                    }
                    split[i] += temp;
                } else {
                    char firstChar = split[i].charAt(0);
                    split[i] = split[i].substring(1) + firstChar;
                    int index = 0;
                    StringBuilder temp = new StringBuilder("ma");
                    while (index < (i + 1)) {
                        temp.append("a");
                        index++;
                    }
                    split[i] += temp;


                }
            }
        }

        return String.join(" ", split);
    }

    public static void main(String[] args) {
        GoatLatin824 g = new GoatLatin824();
//        System.out.println(g.toGoatLatin("I speak Goat Latin"));//Imaa peaksmaaa oatGmaaaa atinLmaaaaa
        System.out.println(g.toGoatLatin("The quick brown fox jumped over the lazy dog"));//
    }
}

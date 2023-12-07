package leetCode;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow500 {
    public String[] findWords(String[] words) {
        //
        String[] keyboard = { "qwertyuiop", "asdfghjkl", "zxcvbnm" };
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String strWord = words[i];

            int keyRow0Counter = 0;
            int keyRow1Counter = 0;
            int keyRow2Counter = 0;
            for (int j = 0; j < strWord.length(); j++) {
                char charWord = strWord.charAt(j);
                if (Character.isUpperCase(charWord))
                    charWord = Character.toLowerCase(charWord);
                if (keyboard[0].contains(Character.toString(charWord)))
                    keyRow0Counter++;
                else if (keyboard[1].contains(Character.toString(charWord)))
                    keyRow1Counter++;
                else if (keyboard[2].contains(Character.toString(charWord)))
                    keyRow2Counter++;
            }
            if (keyRow0Counter == strWord.length() || keyRow1Counter == strWord.length()
                    || keyRow2Counter == strWord.length())
                list.add(strWord);
        }

        return list.toArray(new String[0]);

    }

    public static void main(String[] args) {
        KeyboardRow500 k = new KeyboardRow500();
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        k.findWords(words);
    }
}

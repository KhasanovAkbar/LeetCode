package leetCode;

import java.util.HashMap;

public class IsomorphicStrings205 {
    public boolean isIsomorphic(String s, String t) {
        //
        if (s.length() != t.length()) return false;
        boolean result1 = false;
        boolean result2 = false;
        HashMap<Character, Character> hashMap = new HashMap<>();
        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();
        result1 = isomorphic(result1, hashMap, charArray2, charArray1);
        hashMap = new HashMap<>();
        result2 = isomorphic(result2, hashMap, charArray1, charArray2);

        return result1 && result2;

    }

    private boolean isomorphic(boolean result2, HashMap<Character, Character> hashMap, char[] charArray1, char[] charArray2) {
        for (int i = 0; i < charArray2.length; i++) {
            if (hashMap.get(charArray2[i]) == null) {
                hashMap.put(charArray2[i], charArray1[i]);
                result2 = true;
            } else {
                if (hashMap.get(charArray2[i]).equals(charArray1[i]))
                    result2 = true;
                else {
                    result2 = false;
                    break;
                }
            }
        }
        return result2;
    }

    public static void main(String[] args) {
        IsomorphicStrings205 i = new IsomorphicStrings205();
        System.out.println(i.isIsomorphic("egg", "add")); //true
        System.out.println(i.isIsomorphic("akbar", "fdsfex")); //false
        System.out.println(i.isIsomorphic("badc", "baba")); //false
        System.out.println(i.isIsomorphic("foo", "bar")); //false
        System.out.println(i.isIsomorphic("paper", "title")); //true
    }
}

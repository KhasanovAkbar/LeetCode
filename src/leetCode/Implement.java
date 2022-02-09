package leetCode;

public class Implement {
    public int strStr(String haystack, String needle) {
//        return haystack.indexOf(needle);
        int res = 0;
        if (haystack.isEmpty() && needle.isEmpty()) return res;
        else if (haystack.isEmpty()) return -1;
        else if (needle.isEmpty()) return res;
        else {
            for (int i = 0; i < haystack.length(); i++) {
                if (haystack.length() >= needle.length() && needle.length() + i <= haystack.length()) {
                    String substring = haystack.substring(i, needle.length() + i);
                    if (substring.equals(needle))
                        res += 2;
                    else if (res == 0 && needle.length() + i == haystack.length()) return -1;
                }
            }
            return res;
        }
    }
}

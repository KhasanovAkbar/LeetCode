package leetCode;

public class LongestCommonPrefix {
        public String longestCommonPrefix(String[] strs) {
        int counter = 0;

        external:
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (String str : strs) {
                if ((str.length() <= i) || c != str.charAt(i)) {
                    break external;
                }
            }
            counter++;
        }
        return strs[0].substring(0, counter);
    }
}

package geeksforgeeks;

import java.util.ArrayList;

public class LexicographicallySmaller {

    public static void main(String[] args) {
        String s = "ab12c";
        String t = "1zz456";
        int result = countWaysToRemoveDigit(s, t);
        System.out.println(result);
    }

    public static int countWaysToRemoveDigit(String s, String t) {
        //
        int count = 0;
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)))
                list1.add(removeChar(s, i));
        }
        for (int i = 0; i < t.length(); i++) {
            if (Character.isDigit(t.charAt(i)))
                list2.add(removeChar(t, i));
        }

        for (String s1 : list1) {
            int compare = s1.compareToIgnoreCase(t);
            if (compare < 0) count++;
        }

        for (String t1 : list2) {
            int compare = t1.compareToIgnoreCase(s);
            if (compare > 0) count++;
        }
        return count;
    }


    private static String removeChar(String s, int i) {
        return s.substring(0, i) + s.substring(i + 1);
    }
}

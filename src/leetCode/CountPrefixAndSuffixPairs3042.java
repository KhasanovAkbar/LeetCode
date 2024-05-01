package leetCode;

public class CountPrefixAndSuffixPairs3042 {
    public int countPrefixSuffixPairs(String[] words) {
        //
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].startsWith(words[i]) && i != j && words[j].endsWith(words[i])) {
                    count++;
                }
            }
        }

        return count;

    }

    public static void main(String[] args) {
        //
        CountPrefixAndSuffixPairs3042 c = new CountPrefixAndSuffixPairs3042();
        String[] words = {"a", "aba", "ababa", "aa"};
        System.out.println(c.countPrefixSuffixPairs(words));
    }
}

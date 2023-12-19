package leetCode;

public class RepeatedSubstringPattern459 {
    public boolean repeatedSubstringPattern(String s) {
        //
        int n = s.length();

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                String substring = s.substring(0, i);
                StringBuilder repeated = new StringBuilder();

                repeated.append(substring.repeat(n / i));

                if (repeated.toString().equals(s)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        RepeatedSubstringPattern459 r = new RepeatedSubstringPattern459();
        System.out.println(r.repeatedSubstringPattern("abcabcabcd"));//true "abc"
//        System.out.println(r.repeatedSubstringPattern("aba"));//false "abc"
    }
}

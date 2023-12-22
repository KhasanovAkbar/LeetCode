package leetCode;

public class MaximumScoreAfterSplittingString1422 {
    public int maxScore(String s) {
        //
        int ans = 0;
        int zeros = 0;
        int ones = (int) s.chars().filter(c -> c == '1').count();

        for (int i = 0; i + 1 < s.length(); ++i) {
            if (s.charAt(i) == '0')
                ++zeros;
            else
                --ones;
            ans = Math.max(ans, zeros + ones);
        }

        return ans;
    }

    public static void main(String[] args) {
        MaximumScoreAfterSplittingString1422 m = new MaximumScoreAfterSplittingString1422();
        System.out.println(m.maxScore("011101"));//5
       // left = "0" and right = "11101", score = 1 + 4 = 5
       // left = "01" and right = "1101", score = 1 + 3 = 4
       // left = "011" and right = "101", score = 1 + 2 = 3
       // left = "0111" and right = "01", score = 1 + 1 = 2
       // left = "01110" and right = "1", score = 2 + 1 = 3
    }
}

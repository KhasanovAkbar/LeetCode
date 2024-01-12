package leetCode;

public class CountBinarySubstrings696 {
    public int countBinarySubstrings(String s) {
        //
        int curr = 1, prev = 0, ans = 0;
        for (int i = 1; i < s.length(); i++)
            if (s.charAt(i) == s.charAt(i-1)) curr++;
            else {
                ans += Math.min(curr, prev);
                prev = curr;
                curr = 1;
            }
        return ans + Math.min(curr, prev);
    }

    public static void main(String[] args) {
        CountBinarySubstrings696 c = new CountBinarySubstrings696();
        System.out.println(c.countBinarySubstrings("00110011"));//6
    }
}

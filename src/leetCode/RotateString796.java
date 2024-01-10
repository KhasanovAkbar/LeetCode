package leetCode;

public class RotateString796 {
    public boolean rotateString(String s, String goal) {
        //
        if (s.length() != goal.length()) return false;

        String ans=s + s;
        return ans.contains(goal);

       /* int size = 0;
        StringBuilder sb = new StringBuilder(s);
        while (size < (s.length())) {
            char c = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(c);
            size++;
            if (sb.toString().equals(goal)) return true;
        }
        return false;*/
    }

    public static void main(String[] args) {
        RotateString796 r = new RotateString796();
        System.out.println(r.rotateString("abcde", "abcde"));
    }
}

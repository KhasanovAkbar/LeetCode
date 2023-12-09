package leetCode;

public class ReverseInteger7 {
    public int reverse(int x) {
        //
        int INT32_MIN = Integer.MIN_VALUE;
        int INT32_MAX = Integer.MAX_VALUE;

        int sign = (x >= 0) ? 1 : -1;
        x = Math.abs(x);

        StringBuilder reversedStr = new StringBuilder(Integer.toString(x)).reverse();

        try {
            int reversedInt = sign * Integer.parseInt(reversedStr.toString());

            if (reversedInt < INT32_MIN || reversedInt > INT32_MAX) {
                return 0;
            }
            return reversedInt;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        ReverseInteger7 r = new ReverseInteger7();
        System.out.println(r.reverse(-1230));
    }
}

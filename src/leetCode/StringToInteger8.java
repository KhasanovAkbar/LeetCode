package leetCode;

public class StringToInteger8 {
    public int myAtoi(String s) {
        //
        s = s.trim();

        int sign = 1;
        int i = 0;
        if (s.length() > 0 && (s.charAt(0) == '-' || s.charAt(0) == '+')) {
            sign = (s.charAt(0) == '-') ? -1 : 1;
            i++;
        }

        int result = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = Character.getNumericValue(s.charAt(i));

            if (result > (Integer.MAX_VALUE - digit) / 10)
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            result = result * 10 + digit;
            i++;
        }
        return result * sign;
    }

    public static void main(String[] args) {
        StringToInteger8 s = new StringToInteger8();
        System.out.println(s.myAtoi("   -42 flow"));
    }
}

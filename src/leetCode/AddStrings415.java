package leetCode;

public class AddStrings415 {
    public String addStrings(String num1, String num2) {
       /* StringBuilder sb1 = new StringBuilder(num1);
        char[] charArray1 = sb1.reverse().toString().toCharArray();
        StringBuilder sb2 = new StringBuilder(num2);
        char[] charArray2 = sb2.reverse().toString().toCharArray();
        int result = 0;
        for (int i = 0; i < charArray1.length; i++)
            result += Character.getNumericValue(charArray1[i])* Math.pow(10, i);
        for (int i = 0; i < charArray2.length; i++)
            result += Character.getNumericValue(charArray2[i])*Math.pow(10, i);

        return String.valueOf(result);*/
        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        String result = "";
        int carry = 0;
        for (int i = 0; i < num1.length() || i < num2.length(); i ++) {
            int c1 = 0;
            int c2 = 0;
            if (i < num1.length()) {
                c1 = num1.charAt(i) - '0';
            }
            if (i < num2.length()) {
                c2 = num2.charAt(i) - '0';
            }
            int sum = c1 + c2 + carry;
            int digit = sum % 10;
            carry = sum / 10;
            result = digit + result;
        }
        if (carry != 0) {
            result = carry + result;
        }
        return result;
    }

    public static void main(String[] args) {
        AddStrings415 a = new AddStrings415();
        System.out.println(a.addStrings("11", "123"));
    }
}

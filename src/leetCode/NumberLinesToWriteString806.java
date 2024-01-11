package leetCode;

import java.util.Arrays;

public class NumberLinesToWriteString806 {
    public int[] numberOfLines(int[] widths, String s) {
        //
        int[] result = new int[2];
        int sum = 0;
        int width = 1;
        for (int i = 0; i < s.length(); i++) {
            if ((sum+widths[s.charAt(i) - 'a']) <= 100){
                sum+=widths[s.charAt(i) - 'a'];
            }
            else {
                width++;
                sum = widths[s.charAt(i) - 'a'];
            }
        }
        result[1] = sum;
        result[0] = width;
        return result;
    }

    public static void main(String[] args) {
        NumberLinesToWriteString806 n = new NumberLinesToWriteString806();
       int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s = "abcdefghijklmnopqrstuvwxyz";
        int[] ints = n.numberOfLines(widths, s);
        System.out.println(Arrays.toString(ints)); //[3,60]
    }
}

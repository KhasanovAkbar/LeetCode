package leetCode;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        String temp = "";
        for (int digit : digits) {
            temp += String.valueOf(digit);
        }
        int i = Integer.parseInt(temp);
        i++;
        String string1 = String.valueOf( + 1);
        int[] n = new int[string1.length()];
        for (int j = 0; j < string1.length(); j++) {
            n[j] = Integer.parseInt(String.valueOf(string1.charAt(j)));
        }
        return n;
    }
}

package leetCode;

public class BinaryNumberWithAlternatingBits693 {
    public boolean hasAlternatingBits(int n) {
        //
        int i = Integer.bitCount(n);
        char[] charArray = Integer.toBinaryString(n).toCharArray();
        int counter = 0;
        if (charArray[0] == '1') {
            for (int j = 0; j < charArray.length; j+=2) {
                    if (charArray[j] == '1')
                        counter++;
                    else counter--;
            }
        } else {
            for (int j = 1; j < charArray.length; j+=2) {
                    if (charArray[j] == '1')
                        counter++;
                    else counter--;
            }
        }
        return (i == counter);
    }

    public static void main(String[] args) {
        BinaryNumberWithAlternatingBits693 b = new BinaryNumberWithAlternatingBits693();
        System.out.println(b.hasAlternatingBits(5));//true 101
    }
}

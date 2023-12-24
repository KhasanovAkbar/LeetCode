package leetCode;

public class MinimumChangesToMakeAlternatingBinaryString1758 {
    public int minOperations(String s) {
        //
        if (s.length() < 2) return 0;
        int firstZeros = 0;
        int firstOnes = 0;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (i % 2 == 0) {
                if (charArray[i] != '1')
                    firstOnes++;
            } else {
                if (charArray[i] != '0')
                    firstOnes++;
            }
        }

        for (int i = 0; i < charArray.length; i++) {
            if (i % 2 == 0) {
                if (charArray[i] != '0')
                    firstZeros++;
            } else {
                if (charArray[i] != '1')
                    firstZeros++;
            }
        }
        return Math.min(firstOnes, firstZeros);
    }

    public static void main(String[] args) {
        MinimumChangesToMakeAlternatingBinaryString1758 m = new MinimumChangesToMakeAlternatingBinaryString1758();
        System.out.println(m.minOperations("11"));//1
//        System.out.println(m.minOperations("111001011"));//1
    }
}

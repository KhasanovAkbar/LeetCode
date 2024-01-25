package leetCode;

public class BinaryGap868 {
    public int binaryGap(int n) {
        //
        String binaryString = Integer.toBinaryString(n);
        char[] charArray = binaryString.toCharArray();
        int result = 0;
        int temp = 0;
        for (char c : charArray) {
            if (c == '1') {
                result = Math.max(result, temp);
                temp = 1;
            } else temp++;
        }
        return result;
    }

    public static void main(String[] args) {
        BinaryGap868 b = new BinaryGap868();
        System.out.println(b.binaryGap(22));//10110  -> 2
    }
}

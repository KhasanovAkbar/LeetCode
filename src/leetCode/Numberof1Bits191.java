package leetCode;

public class Numberof1Bits191 {
    public int hammingWeight(int n) {
        //
        return Integer.bitCount(n);
    }

    public static void main(String[] args) {
        Numberof1Bits191 n = new Numberof1Bits191();
        int n1 = Integer.parseInt("1000111", 2);
        System.out.println(n.hammingWeight(n1));
    }
}

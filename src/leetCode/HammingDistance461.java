package leetCode;

public class HammingDistance461 {
    public int hammingDistance(int x, int y) {
        //
        int binaryNumber = x ^ y;
        int setBits = 0;
        while (binaryNumber > 0) {
            setBits += binaryNumber & 1;
            binaryNumber >>= 1;
        }
        return setBits;
    }

    public static void main(String[] args) {
        HammingDistance461 h = new HammingDistance461();
        System.out.println(h.hammingDistance(1, 4));//0001 0100 => corresponding bits are different 2
    }
}

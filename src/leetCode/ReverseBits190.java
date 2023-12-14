package leetCode;

public class ReverseBits190 {
    public int reverseBits(int n) {
        //
        return Integer.reverse(n);
    }

    public static void main(String[] args) {
        ReverseBits190 r = new ReverseBits190();
        String s = "00000010100101000001111010011100";
        int i = Integer.parseInt(s, 2);
        System.out.println(r.reverseBits(12));
    }
}

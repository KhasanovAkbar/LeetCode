package leetCode;

public class ComplementOfBase10Integer1009 {
    public int bitwiseComplement(int n) {
        //
        if (n == 0) return 1;
        int temp = n, mask = 0;
        while (temp != 0){
            mask = (mask<<1)|1;
            temp = temp>>1;
        }
        return (~n) & mask;
    }

    public static void main(String[] args) {
        ComplementOfBase10Integer1009 c = new ComplementOfBase10Integer1009();
        System.out.println(c.bitwiseComplement(10)); // 5
        System.out.println(c.bitwiseComplement(7)); // 0

    }
}

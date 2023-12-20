package leetCode;

public class NumberComplement476 {
    public int findComplement(int num) {
        //
        int power = 0;
        int temp = num;
        while (num > 0) {
            num = (num>>1);
            power++;
        }
        return (int) ( Math.pow(2, power) - 1) ^ temp;
    }

    public static void main(String[] args) {
        NumberComplement476 n = new NumberComplement476();
        System.out.println(n.findComplement(2147483647));//2 101(5) + 010(2) = 111
    }
}

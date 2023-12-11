package leetCode;

public class HappyNumber202 {
    public boolean isHappy(int n) {
        //
        int slow, fast;
        slow = fast = n;

        do {
            slow = numSquareSum(slow);

            fast = numSquareSum(numSquareSum(fast));
        } while (slow != fast);
        return (slow == 1);
    }

    private int numSquareSum(int n) {
        int squareSum = 0;
        while (n != 0) {
            squareSum += (n % 10) * (n % 10);
            n /= 10;
        }
        return squareSum;
    }

    public static void main(String[] args) {
        HappyNumber202 h = new HappyNumber202();
//        System.out.println(h.isHappy(19));//true
        System.out.println(h.isHappy(2));//false
    }
}

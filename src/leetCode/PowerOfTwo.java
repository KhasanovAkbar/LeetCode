package leetCode;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
       /* if (n == 1 || n == -1)
            return true;



            if (n%2 == 0)
                isPowerOfTwo(n/2);
        return false;
*/

    }
}

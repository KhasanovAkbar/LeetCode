package leetCode;

public class TotalHammingDistance477 {
    public int totalHammingDistance(int[] nums) {
        //
       /* int result = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) continue;
                result += hammingDistance(nums[i], nums[j]);
            }
        }
        return result;*/
        int i, j, n = nums.length;
        int count = 0;

        for (i = 0; i < 32; i++) {
            int one = 0, zero = 0;
            for (j = 0; j < n; j++) {
                if ((nums[j] & (1 << i)) > 0) {
                    one++;
                } else
                    zero++;
            }
            count += one * zero;

        }
        return count;
    }

    private int hammingDistance(int n1, int n2) {
        //
        int binaryNumber = n1 ^ n2;
        int setBits = 0;
        while (binaryNumber > 0) {
            setBits += binaryNumber & 1;
            binaryNumber >>= 1;
        }
        return setBits;
    }

    public static void main(String[] args) {
        TotalHammingDistance477 t = new TotalHammingDistance477();
        int[] nums = {4, 14, 2, 5};
        System.out.println(t.totalHammingDistance(nums));
    }
}

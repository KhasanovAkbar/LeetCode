package leetCode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MaximizeSumOfArrayAfterKNegations1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        //
        if (nums.length == 1 && k % 2 == 0) return nums[0];
        else if (nums.length == 1 && k % 2 == 1) return -nums[0];
        else {
            while (k > 0) {
                Arrays.sort(nums);
                nums[0] = -1 * nums[0];
                k--;
            }
        }
        return IntStream.of(nums).sum();
    }

    public static void main(String[] args) {
        MaximizeSumOfArrayAfterKNegations1005 m = new MaximizeSumOfArrayAfterKNegations1005();
//        int[] nums = {2, -3, -1, 5, -4};
        int[] nums = {3, -1, 0, 2};
        System.out.println(m.largestSumAfterKNegations(nums, 3)); //13
    }
}

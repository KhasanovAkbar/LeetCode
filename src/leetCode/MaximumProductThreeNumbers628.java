package leetCode;

import java.util.Arrays;

public class MaximumProductThreeNumbers628 {
    public int maximumProduct(int[] nums) {
        //
        Arrays.sort(nums);
        int n = nums.length - 1;
        int a = nums[0] * nums[1] * nums[n];
        int b = nums[n - 2] * nums[n - 1] * nums[n];
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        MaximumProductThreeNumbers628 m = new MaximumProductThreeNumbers628();
//        int[] nums = {1, 2, 3, 4};
//        int[] nums = {-100,-98,-1,2,3,4};
        int[] nums = {-1, -2, -3, -4};
        System.out.println(m.maximumProduct(nums));
    }

}

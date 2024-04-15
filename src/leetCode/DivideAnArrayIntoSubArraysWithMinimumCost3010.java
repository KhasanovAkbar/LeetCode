package leetCode;

import java.util.Arrays;

public class DivideAnArrayIntoSubArraysWithMinimumCost3010 {
    public int minimumCost(int[] nums) {
        if (nums.length == 3) return Arrays.stream(nums).sum();
        int temp = nums[0];
        nums[0] = 51;
        Arrays.sort(nums);
        return temp + nums[0] + nums[1];
    }

    public static void main(String[] args) {
        //
        DivideAnArrayIntoSubArraysWithMinimumCost3010 d = new DivideAnArrayIntoSubArraysWithMinimumCost3010();
        int[] nums = {1, 2, 3, 4};
        System.out.println(d.minimumCost(nums));
    }
}

package leetCode;

import java.util.Arrays;

public class MinimumNumberGame2974 {
    public int[] numberGame(int[] nums) {
        //
        int[] result = new int[nums.length];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {
            result[i] = nums[i + 1];
            result[i + 1] = nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        //
        MinimumNumberGame2974 m = new MinimumNumberGame2974();
        int[] nums = {2, 5};
        int[] numberGame = m.numberGame(nums);
        for (int i : numberGame) {
            System.out.print(i + " ");
        }
    }
}

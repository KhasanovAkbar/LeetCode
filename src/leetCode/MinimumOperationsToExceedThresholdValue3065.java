package leetCode;

public class MinimumOperationsToExceedThresholdValue3065 {
    public int minOperations(int[] nums, int k) {
        //
        int count = 0;
        for (int num : nums) {
            if (num < k) count++;
        }

        return count;

    }

    public static void main(String[] args) {
        //
        MinimumOperationsToExceedThresholdValue3065 m = new MinimumOperationsToExceedThresholdValue3065();
        int[] nums = {2, 11, 10, 1, 3};
        int k = 10;
        System.out.println(m.minOperations(nums, k));
    }
}

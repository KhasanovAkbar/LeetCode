package leetCode;

public class MonotonicArray896 {
    public boolean isMonotonic(int[] nums) {
        //
        if (nums[0] < nums[nums.length - 1]) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] <= nums[i + 1]) {

                } else
                    return false;
            }
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] >= nums[i + 1]) {

                } else
                    return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        MonotonicArray896 m = new MonotonicArray896();
        int[] nums = {1, 2, 2, 0};
        System.out.println(m.isMonotonic(nums)); //true
    }
}

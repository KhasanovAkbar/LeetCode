package leetCode;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                res += 1;
                nums[res] = nums[i + 1];
            }
        }
        return res + 1;
    }
}

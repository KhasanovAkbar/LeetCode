package leetCode;

import java.util.Arrays;

public class MajorityElement169 {
    public int majorityElement(int[] nums) {
        //
        int result = Integer.MAX_VALUE;

        for (int num : nums) {
            int counter = 0;
            for (int j = 1; j < nums.length; j++) {
                if (num == nums[j])
                    counter++;
            }

            if (counter >= nums.length / 2) {
                result = num;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MajorityElement169 m = new MajorityElement169();
        int[] a = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(m.majorityElement(a));
    }
}

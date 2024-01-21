package leetCode;

import java.util.Arrays;

public class LargestPerimeterTriangle976 {
    public int largestPerimeter(int[] nums) {
        //
        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 2; i--)
            if (nums[i] < nums[i-1] + nums[i-2])
                return nums[i] + nums[i-1] + nums[i-2];

        return 0;
    }

    public static void main(String[] args) {
        LargestPerimeterTriangle976 l = new LargestPerimeterTriangle976();
        int[] nums = {1,2,1,10};
        System.out.println(l.largestPerimeter(nums));//0
    }
}

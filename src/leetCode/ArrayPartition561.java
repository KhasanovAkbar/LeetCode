package leetCode;

import java.util.Arrays;

public class ArrayPartition561 {
    public int arrayPairSum(int[] nums) {
        //
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i+=2) {
            sum += Math.min(nums[i], nums[i+1]);
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayPartition561 a = new ArrayPartition561();
        int[] nums = {1, 4, 3, 2}; //min(1, 2) + min(3, 4) = 1 + 3 = 4
//        int[] nums = {6, 2, 6, 5, 1, 2};//min(2, 1) + min(2, 5) + min(6, 6) = 1 + 2 + 6 = 9
        System.out.println(a.arrayPairSum(nums));
    }
}

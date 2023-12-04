package leetCode;

import java.util.Arrays;

public class MoveZeroes283 {
    public void moveZeroes(int[] nums) {
        //
        int count = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != 0)
                nums[count++] = nums[i];

        while (count < nums.length)
            nums[count++] = 0;
    }

    public static void main(String[] args) {
        MoveZeroes283 m = new MoveZeroes283();
        int[] a = {0,1,0,3,12};
        m.moveZeroes(a);
        for (int j : a) {
            System.out.print(j + " ");
        }
    }
}

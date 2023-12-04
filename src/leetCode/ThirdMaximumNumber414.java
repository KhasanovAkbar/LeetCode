package leetCode;

import java.util.Arrays;

public class ThirdMaximumNumber414 {
    public int thirdMax(int[] nums) {
        //
        int count = 0;
        int[] array = Arrays.stream(nums).sorted().toArray();
        int   result = array[array.length-1];
        for (int i = array.length-1; i>0; i--) {
            if (array[i] != array[i - 1])
                count++;

            if (count == 2) {
                result = array[i-1];
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ThirdMaximumNumber414 t = new ThirdMaximumNumber414();
        int[] a = {1, 1 ,1, 2, 3};
        System.out.println(t.thirdMax(a));
    }
}

package leetCode;

import java.util.Arrays;

public class HeightChecker1051 {
    public int heightChecker(int[] heights) {
        //
        int[] temp = heights.clone();
        Arrays.sort(temp);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != temp[i])
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        HeightChecker1051 h = new HeightChecker1051();
        int[] nums = {5, 1, 2, 3, 4};
        System.out.println(h.heightChecker(nums));
    }

}

package leetCode;

import java.util.Arrays;

public class FindCommonElementsBetweenTwoArrays2956 {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        //
        int[] result = new int[2];
        int count = 0;

        for (int j : nums1) {
            for (int k : nums2) {
                if (j == k) {
                    count++;
                    break;
                }
            }
        }
        result[0] = count;

        count = 0;
        for (int j : nums2) {
            for (int k : nums1) {
                if (j == k) {
                    count++;
                    break;
                }
            }
        }
        result[1] = count;
        return result;
    }

    public static void main(String[] args) {
        FindCommonElementsBetweenTwoArrays2956 f = new FindCommonElementsBetweenTwoArrays2956();
        int[] nums1 = {4, 3, 2, 3, 1};
        int[] nums2 = {2, 2, 5, 2, 3, 6};
        int[] intersectionValues = f.findIntersectionValues(nums1, nums2);
        for (int intersectionValue : intersectionValues) {
            System.out.print(intersectionValue + " ");
        }
    }
}

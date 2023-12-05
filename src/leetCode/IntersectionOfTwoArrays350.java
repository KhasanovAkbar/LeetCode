package leetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArrays350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        //
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                res.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else j++;
        }
        return res.stream().mapToInt(item -> item).toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1}, nums2 = {2, 2};
        IntersectionOfTwoArrays350 i = new IntersectionOfTwoArrays350();
        int[] intersect = i.intersect(nums1, nums2);
        for (int item : intersect)
            System.out.print(item + " ");
    }
}

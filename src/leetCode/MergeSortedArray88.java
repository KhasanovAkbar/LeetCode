package leetCode;

import java.util.Arrays;

/*
* You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.*/
public class MergeSortedArray88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, nums1.length);
        } else if (n != 0) {
            if (nums1.length - m >= 0) System.arraycopy(nums2, 0, nums1, m, nums1.length - m);
            Arrays.sort(nums1);
        }
    }

    public static void main(String[] args) {
        MergeSortedArray88 m = new MergeSortedArray88();
        int[] n1 = {1, 3, 4, 5, 0, 0, 0};
        int[] n2 = {1, 2, 2};
        m.merge(n1, 4, n2, 3);
        for (int j : n1) {
            System.out.print(j + " ");
        }
    }
}

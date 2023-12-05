package leetCode;

import java.util.Arrays;

public class NextGreaterElement496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //
        int[] result = new int[nums1.length];
        Arrays.fill(result, -1);

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    while (j < (nums2.length - 1)) {
                        j++;
                        if (nums2[j] > nums1[i]) {
                            result[i] = nums2[j];
                            break;
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        NextGreaterElement496 n = new NextGreaterElement496();
//        int[] nums1 = {4, 1, 2}, nums2 = {1,3,4,2};
        int[] nums1 = {1, 3, 5, 2, 4}, nums2 = {6, 5, 4, 3, 2, 1, 7};
        int[] ints = n.nextGreaterElement(nums1, nums2);
        for (int item : ints)
            System.out.print(item + " ");
    }
}

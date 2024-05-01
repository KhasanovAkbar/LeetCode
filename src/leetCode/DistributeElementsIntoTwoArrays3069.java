package leetCode;

import java.util.ArrayList;

public class DistributeElementsIntoTwoArrays3069 {
    public int[] resultArray(int[] nums) {
        //
        ArrayList<Integer> nums1 = new ArrayList<>();
        ArrayList<Integer> nums2 = new ArrayList<>();
        nums1.add(nums[0]);
        nums2.add(nums[1]);

        int[] answer = new int[nums.length];

        for (int i = 2; i < nums.length; i++) {
            if (nums1.get(nums1.size() - 1) > nums2.get(nums2.size() - 1))
                nums1.add(nums[i]);
            else
                nums2.add(nums[i]);
        }

        int index = 0;
        for (Integer integer : nums1) {
            answer[index++] = integer;
        }

        for (Integer integer : nums2) {
            answer[index++] = integer;
        }

        return answer;
    }

    public static void main(String[] args) {
        //
        DistributeElementsIntoTwoArrays3069 d = new DistributeElementsIntoTwoArrays3069();
        int[] nums = {5, 4, 3, 8};
        int[] resultArray = d.resultArray(nums);
        for (int i : resultArray) {
            System.out.print(i + " ");
        }
    }
}

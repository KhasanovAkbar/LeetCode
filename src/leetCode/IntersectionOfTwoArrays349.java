package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

public class IntersectionOfTwoArrays349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        //
        ArrayList<Integer> result = new ArrayList<>();
        int[] num1 = IntStream.of(nums1).distinct().toArray();
        int[] num2 = IntStream.of(nums2).distinct().toArray();
        HashSet<Integer> intersection = new HashSet<>();
        for (int item1 : num1)
            intersection.add(item1);
        for (int item2 : num2) {
            if (!intersection.add(item2))
                result.add(item2);
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        IntersectionOfTwoArrays349 i = new IntersectionOfTwoArrays349();
        int[] nums1 = {2, 2, 3}, nums2 = {2, 2, 3};
        int[] intersection = i.intersection(nums1, nums2);
       for (int item:intersection)
           System.out.print(item+" ");

    }
}

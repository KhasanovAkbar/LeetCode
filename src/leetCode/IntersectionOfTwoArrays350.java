package leetCode;

import java.util.ArrayList;

public class IntersectionOfTwoArrays350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        //
        ArrayList<Integer> res = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (; j < nums2.length;) {
                if (nums1[i] == nums2[j]) {
                    res.add(nums1[i]);
                    j++;
                    break;
                }
            }
        }
      /*  HashMap<Integer, Integer> intersection = new HashMap<>();
        for (int item1 : nums1) {
            intersection.put(item1, 1);
        }
        for (int item2 : nums2) {
            if (intersection.get(item2) == null) {
                intersection.put(item2, 1);
            } else {
                Integer integer = intersection.get(item2);
                integer++;
                intersection.put(item2, integer);
            }
        }
        Set<Integer> integers = intersection.keySet();*/
        return res.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}, nums2 = {2, 2};
        IntersectionOfTwoArrays350 i = new IntersectionOfTwoArrays350();
        int[] intersect = i.intersect(nums1, nums2);
        for (int item : intersect)
            System.out.print(item + " ");
    }
}

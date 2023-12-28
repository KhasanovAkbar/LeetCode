package leetCode;

import java.util.*;

public class LongestHarmoniousSubsequence594 {
    public int findLHS(int[] nums) {
        //
        Arrays.sort(nums);
        HashMap<Integer, Integer> numHash = new HashMap<>();
        for (int item : nums) {
            if (numHash.get(item) != null) {
                Integer integer = numHash.get(item);
                numHash.put(item, ++integer);
            } else
                numHash.put(item, 1);
        }
        List<Integer> hashKeys = new ArrayList<>(numHash.keySet());
        Collections.sort(hashKeys);
        int result = 0;
        for (int i = 0; i < hashKeys.size() - 1; i++) {
            if (Math.abs(hashKeys.get(i) - hashKeys.get(i + 1)) == 1)
                result = Math.max(numHash.get(hashKeys.get(i)) + numHash.get(hashKeys.get(i + 1)), result);
        }
        return result;
    }

    public static void main(String[] args) {
        LongestHarmoniousSubsequence594 l = new LongestHarmoniousSubsequence594();
//        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
//        int[] nums = {1, 2, 3, 4};
//        int[] nums = {1, 1, 1, 1};
//        int[] nums = {1, 2, 2, 3, 4, 5, 1, 1, 1, 1};
        int[] nums = {1, 3, 1, 3, 2, 3, 0, 3, 0, 1, 2, 2, 2, -1, 2, 1, 0, 0, 2, 2, 3, -3, 1, 2, 2, 0, 1, 3, 1};
        System.out.println(l.findLHS(nums));
    }
}

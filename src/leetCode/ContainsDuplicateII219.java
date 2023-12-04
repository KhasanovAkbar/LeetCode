package leetCode;

import java.util.HashSet;

public class ContainsDuplicateII219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i]))
                return true;
            if (i >= k)
                set.remove(nums[k - 1]);
        }
        return false;
       /* boolean result = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
                    result = true;
                    break;
                }
                if (result)
                    break;
            }
        }

        return result;*/
    }

    public static void main(String[] args) {
        ContainsDuplicateII219 c = new ContainsDuplicateII219();
        int[] a = {1,0,1,1};
        System.out.println(c.containsNearbyDuplicate(a, 1));
    }
}

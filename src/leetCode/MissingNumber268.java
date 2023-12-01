package leetCode;

import java.util.HashMap;

public class MissingNumber268 {
    public int missingNumber(int[] nums) {
        //
        int result = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i, 1);
        }

        for (int num : nums) {
            map.put(num, 2);
        }
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i) == 1)
                result = i;

        }
        return result;
    }

    public static void main(String[] args) {
        MissingNumber268 m = new MissingNumber268();
        int[] a = {1, 0};
        System.out.println(m.missingNumber(a));
    }
}

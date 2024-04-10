package leetCode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class CountElementsWithMaximumFrequency3005 {
    public int maxFrequencyElements(int[] nums) {
        //
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        List<Integer> list = map.values().stream().sorted(Comparator.reverseOrder()).toList();
        int sum = list.get(0);
        for (int i = 0; i < list.size() - 1; i++) {
            if (Objects.equals(list.get(i), list.get(i + 1))) {
                sum += list.get(i + 1);
            } else {
                break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        CountElementsWithMaximumFrequency3005 c = new CountElementsWithMaximumFrequency3005();
//        int[] nums = {2, 2, 3, 1, 3};
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(c.maxFrequencyElements(nums));
    }
}

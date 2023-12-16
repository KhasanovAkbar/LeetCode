package leetCode;

import java.util.*;

public class ThreeSum15 {
    public List<List<Integer>> threeSum(int[] nums) {
        //
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0, j = 0, n = nums.length, k = n - 1;
        if (k < 2 || nums[k] < 0) {
            return res;
        }
        while (i < n - 2) {
            if (nums[i] > 0) {
                break;
            }
            int target = -nums[i];
            j = i + 1;
            k = n - 1;
            while (j < k) {
                if (nums[k] < 0) {
                    break;
                }
                if (nums[j] + nums[k] == target) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while(j < k && nums[j] == nums[++j]);
                    while(j < k && nums[k] == nums[--k]);
                } else if (nums[j] + nums[k] > target) {
                    k--;
                } else {
                    j++;
                }
            }
            while (i < n - 2 && nums[i] == nums[++i]);
        }
        return res;
       /* List<List<Integer>> numbers = new LinkedList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> innerNumbers = new ArrayList<>();
                        innerNumbers.add(nums[i]);
                        innerNumbers.add(nums[j]);
                        innerNumbers.add(nums[k]);
                        Collections.sort(innerNumbers);
                        if (numbers.size() == 0)
                            numbers.add(innerNumbers);

                        int temp = 0;
                        while (temp < numbers.size()) {
                            if (!numbers.get(temp).equals(innerNumbers)) {
                                numbers.add(innerNumbers);
                                break;
                            }
                            else if (numbers.get(temp).equals(innerNumbers))
                                break;
                            temp++;
                        }


                    }
                }
            }
        }
        return numbers;*/
    }

    public static void main(String[] args) {
        ThreeSum15 t = new ThreeSum15();
//        int[] nums = {-1, 0, 1, 2, -1, -4};
        int[] nums = {3, 0, -2, -1, 1, 2};
//        int[] nums = {0,0,0};
        List<List<Integer>> lists = t.threeSum(nums);
        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}

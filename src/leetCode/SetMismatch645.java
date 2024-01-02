package leetCode;

import java.util.HashMap;

public class SetMismatch645 {
    public int[] findErrorNums(int[] nums) {
        //
        int l = nums.length;
        int[] ar = new int[l+1];
        for (int num : nums) {
            ar[num]++;
        }
        int dup = 0;
        int miss = 0;
        for(int j = 1; j <= l; j++){
            if(ar[j] == 2) dup = j;
            else if(ar[j] == 0) miss = j;
        }
        return new int[] {dup, miss};
       /* int[] result = new int[2];
        HashMap<Integer, Integer> numHash = new HashMap<>();
        for (int i = 1; i <= nums.length; i++) {
            numHash.put(i, 1);
        }

        for (int num : nums) {
            Integer integer = numHash.get(num);
            numHash.put(num, ++integer);
        }
        for (int i = 1; i <= numHash.size(); i++) {
            if (numHash.get(i) == 1)
                result[1] = i;
            else if (numHash.get(i) == 3)
                result[0] = i;

        }
        return result;*/
    }

    public static void main(String[] args) {
        SetMismatch645 s = new SetMismatch645();
        int[] nums = {1, 2, 2, 4};
        int[] errorNums = s.findErrorNums(nums);
        System.out.println(errorNums[0] + " " + errorNums[1]);
    }
}

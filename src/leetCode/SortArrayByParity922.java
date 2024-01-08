package leetCode;

import java.util.Arrays;

public class SortArrayByParity922 {
    public int[] sortArrayByParityII(int[] nums) {
        //
        int odd = 1;
        int even = 0;

        int[] result = new int[nums.length];

        for(int i : nums){
            if(i % 2 == 0){
                result[even] = i;
                even += 2;
            }else{
                result[odd] = i;
                odd += 2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        SortArrayByParity922 s = new SortArrayByParity922();
        int[] nums = {4, 2, 5, 7};
        int[] ints = s.sortArrayByParityII(nums); //[4,7,2,5], [2,5,4,7], [2,7,4,5]
        System.out.println(Arrays.toString(ints));
    }
}

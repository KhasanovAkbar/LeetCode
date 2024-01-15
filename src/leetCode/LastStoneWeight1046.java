package leetCode;

import java.util.Arrays;
import java.util.Collections;

public class LastStoneWeight1046 {
    int result = 0;
    public int lastStoneWeight(int[] stones) {
        //
        if (stones.length == 1) result = stones[0];
        else if (stones.length == 0) result = 0;
        else {
            Integer[] array = Arrays.stream(stones).boxed().toArray(Integer[]::new);
            Arrays.sort(array, Collections.reverseOrder());
            int[] temp;
            if (array[0].equals(array[1])) {
                temp = new int[array.length - 2];
                for (int i = 0; i < array.length - 2; i++) {
                    temp[i] = array[i + 2];
                }
            } else {
                temp = new int[array.length - 1];
                temp[0] = array[0] - array[1];
                for (int i = 1; i < array.length - 1; i++) {
                    temp[i] = array[i + 1];
                }
            }
            lastStoneWeight(temp);
        }
        return result;
    }

    public static void main(String[] args) {
        LastStoneWeight1046 l = new LastStoneWeight1046();
//        int[] nums = {2, 7, 4, 1, 8, 1};
        int[] nums = {2, 2};
        System.out.println(l.lastStoneWeight(nums));//1
    }
}

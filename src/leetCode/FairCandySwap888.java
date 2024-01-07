package leetCode;

import java.util.HashMap;
import java.util.Map;

public class FairCandySwap888 {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        //
        int sum1 = 0, sum2 = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int aliceSize : aliceSizes) {
            sum1 = sum1 + aliceSize;
        }

        for (int bobSize : bobSizes) {
            sum2 = sum2 + bobSize;
            map.put(bobSize, 1);
        }

        int k = (sum1 - sum2) / 2;

        for (int aliceSize : aliceSizes) {
            if (map.containsKey(aliceSize - k))
                return new int[]{aliceSize, aliceSize - k};
        }

        return new int[]{-1, -1};

    }


    public static void main(String[] args) {
        FairCandySwap888 f = new FairCandySwap888();
        int[] num1 = {1, 1};
        int[] num2 = {2, 2};
        int[] ints = f.fairCandySwap(num2, num1);

        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
    }
}

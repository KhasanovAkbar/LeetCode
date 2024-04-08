package leetCode;

import java.util.HashMap;

public class FindMissingAndRepeatedValues2965 {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        //

        final int n = grid.length;
        final int nSquared = n * n;
        int[] count = new int[nSquared + 1];

        for (int[] row : grid)
            for (final int num : row)
                ++count[num];

        int repeated = -1;
        int missing = -1;

        for (int i = 1; i <= nSquared; ++i) {
            if (count[i] == 2)
                repeated = i;
            if (count[i] == 0)
                missing = i;
        }

        return new int[] {repeated, missing};
       /* int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int[] ints : grid) {
            for (int anInt : ints) {
                if (map.containsKey(anInt)) {
                    map.put(anInt, map.get(anInt) + 1);
                } else {
                    map.put(anInt, 1);
                }
            }
        }
        for (int i = 1; i <= grid.length * grid.length; i++) {
            if (!map.containsKey(i)) {
                result[1] = i;
            } else if (map.get(i) == 2) {
                result[0] = i;
            }
        }
        return result;*/
    }

    public static void main(String[] args) {
        //
        FindMissingAndRepeatedValues2965 f = new FindMissingAndRepeatedValues2965();
        int[][] nums1 = {{1, 2, 3}, {4, 9, 6}, {7, 8, 9}};
        int[] missingAndRepeatedValues = f.findMissingAndRepeatedValues(nums1);
        for (int missingAndRepeatedValue : missingAndRepeatedValues) {
            System.out.print(missingAndRepeatedValue + " ");
        }
    }
}

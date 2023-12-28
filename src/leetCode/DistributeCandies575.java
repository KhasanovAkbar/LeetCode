package leetCode;

import java.util.HashSet;

public class DistributeCandies575 {
    public int distributeCandies(int[] candyType) {
        //
        int size = candyType.length / 2;
        HashSet<Integer> candySets = new HashSet<>();
        for (int item : candyType)
            candySets.add(item);

        return Math.min(candySets.size(), size);
    }

    public static void main(String[] args) {
        DistributeCandies575 d = new DistributeCandies575();
        int[] nums = {1, 1, 2, 2, 3, 3}; //3
//        int[] nums = {1, 1, 2, 3}; //2
//        int[] nums = {6, 6, 6, 6}; //1
        System.out.println(d.distributeCandies(nums));
    }
}

package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;

public class FindAllNumbersDisappearedInAnArray448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //
        ArrayList<Integer> res = new ArrayList<>();
        int size = nums.length;
        HashSet<Integer> hashSet = new HashSet<>();
        Arrays.sort(nums);
        int[] array = IntStream.of(nums).distinct().toArray();
        for (int j : array) {
            hashSet.add(j);
        }
        for (int i = 1; i <= size; i++) {
            if (hashSet.add(i)) {
                res.add(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        FindAllNumbersDisappearedInAnArray448 f = new FindAllNumbersDisappearedInAnArray448();
        int[] a = {4,3,2,7,8,2,3,1};
        List<Integer> disappearedNumbers = f.findDisappearedNumbers(a);
        for (Integer item: disappearedNumbers)
            System.out.print(item+" ");
    }
}

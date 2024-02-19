package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayFormOfInteger989 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        //
        List<Integer> result = new ArrayList<>();

        List<Integer> kNum = new ArrayList<>();
        while (k / 10 != 0) {
            kNum.add(k % 10);
            k /= 10;
        }

        if (k != 0)
            kNum.add(k);

        for (int i = 0; i < num.length / 2; i++) {
            int temp = num[i];
            num[i] = num[num.length - i - 1];
            num[num.length - i - 1] = temp;
        }
        int tenth = 0;
        int size = Math.min(num.length, kNum.size());
        for (int i = 0; i < size; i++) {
            int temp = num[i] + kNum.get(i) + tenth;
            result.add(temp % 10);
            tenth = temp / 10;
        }
        int maxSize = Math.max(num.length, kNum.size());
        int j = size;
        if (maxSize == num.length) {
            while (j < maxSize) {
                int temp = num[j] + tenth;
                result.add(temp % 10);
                tenth = temp / 10;
                j++;
            }
        } else {
            while (j < maxSize) {
                int temp = kNum.get(j) + tenth;
                result.add(temp % 10);
                tenth = temp / 10;
                j++;
            }
        }
        if (tenth != 0)
            result.add(tenth);
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        AddToArrayFormOfInteger989 a = new AddToArrayFormOfInteger989();
        int[] nums = {1, 2, 0, 0};
//        int[] nums = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        List<Integer> integers = a.addToArrayForm(nums, 34);
        for (Integer integer : integers)
            System.out.print(integer + " ");
    }
}

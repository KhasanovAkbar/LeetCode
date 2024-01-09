package leetCode;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        //
        List<Integer> result = new ArrayList<>();
        if (left >= 1 && right <= 9) {
            for (int i = left; i <= right; i++) {
                result.add(i);
            }
            return result;
        } else if (left < 10) {
            for (int i = left; i <= 9; i++) {
                result.add(i);
            }
            left = 11;
        }
        while (left <= right) {
            if (isSelfDigit(left))
                result.add(left);
            left++;
        }
        return result;
    }

    private boolean isSelfDigit(int left) {
        //
        int digit = left, ceil;
        while (digit != 0) {
            ceil = digit % 10;
            if (ceil == 0) return false;
            if (left % ceil != 0)
                return false;
            digit /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        SelfDividingNumbers728 s = new SelfDividingNumbers728();
//        System.out.println(s.selfDividingNumbers(1, 22));//1,2,3,4,5,6,7,8,9,11,12,15,22
        System.out.println(s.selfDividingNumbers(47, 85));//48,55,66,77
    }
}

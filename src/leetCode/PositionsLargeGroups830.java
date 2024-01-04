package leetCode;

import java.util.ArrayList;
import java.util.List;

public class PositionsLargeGroups830 {
    public List<List<Integer>> largeGroupPositions(String s) {
        //
        int counter = 1;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1))
                counter++;
            else {
                if (counter >= 3) {
                    List<Integer> innerResult = new ArrayList<>();
                    innerResult.add(i - counter + 1);
                    innerResult.add(i);
                    result.add(innerResult);
                }
                counter = 1;
            }
        }
        if (counter>=3){
            List<Integer> innerResult = new ArrayList<>();
            innerResult.add(s.length()-counter);
            innerResult.add(s.length()-1);
            result.add(innerResult);
        }
        return result;
    }

    public static void main(String[] args) {
        PositionsLargeGroups830 p = new PositionsLargeGroups830();
        List<List<Integer>> lists = p.largeGroupPositions("babaaaabbb"); //[[3,5],[6,9],[12,14]]
//        List<List<Integer>> lists = p.largeGroupPositions("abcdddeeeeaabbbcd"); //[[3,5],[6,9],[12,14]]
        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}

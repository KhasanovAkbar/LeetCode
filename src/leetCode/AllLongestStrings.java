package leetCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class AllLongestStrings {
    String[] solution(String[] inputArray) {
        //
        if(inputArray.length<2) return inputArray;

        int[] num = {1,2,23};
        ArrayList<String> un = new ArrayList<>(Arrays.asList(inputArray));
        Integer[] array = Arrays.stream(num).boxed().toArray(Integer[]::new);
        Arrays.sort(array, Collections.reverseOrder());
        Arrays.sort(inputArray, Comparator.naturalOrder());


        ArrayList<String> result = new ArrayList<>();
        result.add(inputArray[0]);
        for (int i = 0; i < inputArray.length-1; i++) {
            if(inputArray[i].length() == inputArray[i+1].length())
                result.add(inputArray[i+1]);
            else break;
        }

        return result.toArray(new String[0]);

    }


    public static void main(String[] args) {
        AllLongestStrings a = new AllLongestStrings();
        String[] atr = {"aba", "aa", "ad", "vcd", "aba"};
        String[] solution = a.solution(atr);
        for (String s : solution) {
            System.out.print(s + " ");
        }
    }
}

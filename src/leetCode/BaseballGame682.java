package leetCode;

import java.util.ArrayList;

public class BaseballGame682 {
    public int calPoints(String[] operations) {
        //
        ArrayList<Integer> arrays = new ArrayList<>();
        for (String operation : operations) {
            int size = arrays.size() - 1;
            switch (operation) {
                case "+" -> {
                    int sum = arrays.get(size - 1) + arrays.get(size);
                    arrays.add(sum);
                }
                case "D" -> arrays.add(arrays.get(size) * 2);
                case "C" -> arrays.remove(size);
                default -> {
                    int i1 = Integer.parseInt(operation);
                    arrays.add(i1);
                }
            }
        }
        int sum = 0;
        for (Integer array : arrays)
            sum += array;

        return sum;
    }

    public static void main(String[] args) {
        BaseballGame682 b = new BaseballGame682();
//        String[] input = {"5", "2", "C", "D", "+"};
        String[] input = {"5","-2","4","C","D","9","+","+"};
        System.out.println(b.calPoints(input));//30
    }
}

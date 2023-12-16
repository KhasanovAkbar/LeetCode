package leetCode;

import java.util.TreeMap;

public class IntegerToRoman12 {
    private static final TreeMap<Integer, String> romanHashMap = new TreeMap<>();
    static {
        romanHashMap.put(1, "I");
        romanHashMap.put(4, "IV");
        romanHashMap.put(5, "V");
        romanHashMap.put(10, "X");
        romanHashMap.put(9, "IX");
        romanHashMap.put(40, "XL");
        romanHashMap.put(50, "L");
        romanHashMap.put(90, "XC");
        romanHashMap.put(100, "C");
        romanHashMap.put(400, "CD");
        romanHashMap.put(500, "D");
        romanHashMap.put(900, "CM");
        romanHashMap.put(1000, "M");
    }

    public String intToRoman(int num) {
        //


        Integer integer = romanHashMap.floorKey(num);
        if (num == integer)
            return romanHashMap.get(num);
        return romanHashMap.get(integer) +
                intToRoman(num - integer);

    }

    public static void main(String[] args) {
        IntegerToRoman12 i = new IntegerToRoman12();
//        System.out.println(i.intToRoman(3)); //III
//        System.out.println(i.intToRoman(58)); //LVIII
        System.out.println(i.intToRoman(1994)); //MCMXCIV

    }
}

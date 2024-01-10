package leetCode;

import java.util.HashSet;

public class JewelsandStones771 {
    public int numJewelsInStones(String jewels, String stones) {
        //
        HashSet<Character> jewelSet = new HashSet<>();
        char[] charArray = jewels.toCharArray();
        for (char c : charArray) {
            jewelSet.add(c);
        }

        char[] stonesCharArray = stones.toCharArray();
        int count = 0;
        for (char c : stonesCharArray) {
            if (jewelSet.contains(c))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        JewelsandStones771 j = new JewelsandStones771();
        System.out.println(j.numJewelsInStones("aA", "aAAbbbb"));//3
        System.out.println(j.numJewelsInStones("z", "ZZ"));//3
    }
}

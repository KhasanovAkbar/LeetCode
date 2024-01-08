package leetCode;

import java.util.HashMap;

public class DeckOfCards914 {

    static int hcf(int x, int y) {
        if (y == 0) return x;
        return hcf(y, x % y);
    }

    public boolean hasGroupsSizeX(int[] deck) {
        //
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int n = deck.length;
        if (n == 1) return false;
        for (int j : deck) {
            hashMap.put(j, hashMap.getOrDefault(j, 0) + 1);
        }

        int x = hashMap.get(deck[0]);

        for (var a : hashMap.values()) {
            x = hcf(x, a);
        }

        return x != 1;

    }

    public static void main(String[] args) {
        DeckOfCards914 d = new DeckOfCards914();
//        int[] nums = {1, 2, 3, 4, 4, 3, 2, 1};
//        int[] nums = {1, 1, 1, 2, 2, 2, 3, 3};
        int[] nums = {0, 0, 0, 1, 1, 1, 2, 2, 2};
        System.out.println(d.hasGroupsSizeX(nums));//true
    }
}

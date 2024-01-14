package leetCode;

import java.util.HashMap;

public class DesignHashMap706 {


    private HashMap<Integer, Integer> hm;

    public DesignHashMap706() {
        hm = new HashMap<>();
    }

    public void put(int key, int value) {
        hm.put(key, value);
    }

    public int get(int key) {
        if (hm.containsKey(key)) {
            return hm.get(key);
        } else {
            return -1;
        }
    }

    public void remove(int key) {
        hm.remove(key);
    }
}

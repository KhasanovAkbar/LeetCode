package leetCode;

import java.util.Arrays;

public class DesignHashSet705 {
    private boolean[] mp;

    public DesignHashSet705() {
        mp = new boolean[1000001];
        Arrays.fill(mp, false);
    }

    public void add(int key) {
        mp[key] = true;
    }

    public void remove(int key) {
        mp[key] = false;
    }

    public boolean contains(int key) {
        return mp[key];
    }

    public static void main(String[] args) {
        DesignHashSet705 d = new DesignHashSet705();
        d.add(1);
        d.contains(1);
    }
}

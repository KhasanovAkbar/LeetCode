package leetCode;

public class Roman {

    int value(char symbol) {
        if (symbol == 'I') return 1;
        if (symbol == 'V') return 5;
        if (symbol == 'X') return 10;
        if (symbol == 'L') return 50;
        if (symbol == 'C') return 100;
        if (symbol == 'D') return 500;
        if (symbol == 'M') return 1000;
        return -1;
    }

    public int romanToInt(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int s1 = value(s.charAt(i));
            if (i + 1 < s.length()) {
                int s2 = value(s.charAt(i + 1));
                if (s1 >= s2)
                    res += s1;
                 else {
                    res = res + s2 - s1;
                    i++;
                }
            } else res += s1;
        }
        return res;
    }
}

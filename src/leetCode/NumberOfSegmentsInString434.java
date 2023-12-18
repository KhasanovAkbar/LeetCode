package leetCode;

public class NumberOfSegmentsInString434 {
    public int countSegments(String s) {
        //
        if (s.trim().isEmpty()) return 0;
        int result = 0;
        String[] split = s.trim().split(" ");
        for (String item : split)
            if (!item.trim().isEmpty()) result++;
        return result;
    }

    public static void main(String[] args) {
        NumberOfSegmentsInString434 n = new NumberOfSegmentsInString434();
        System.out.println(n.countSegments(", , , ,        a, eaefa"));
    }
}

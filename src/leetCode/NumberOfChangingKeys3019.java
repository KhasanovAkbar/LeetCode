package leetCode;

public class NumberOfChangingKeys3019 {
    //
    public int countKeyChanges(String s) {
        String lowerCase = s.toLowerCase();
        int count = 0;

        for (int i = 0; i < lowerCase.length()-1; i++) {
            if (lowerCase.charAt(i) != lowerCase.charAt(i+1)) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        //
        NumberOfChangingKeys3019 n = new NumberOfChangingKeys3019();
        String s = "AaBbCc";
        System.out.println(n.countKeyChanges(s));
    }
}

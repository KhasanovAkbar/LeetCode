package leetCode;

public class AddDigits258 {
    public int addDigits(int num) {
        //
        if (num / 10 == 0) return num;
        int temp = 0;
        while (num / 10 != 0) {
            temp += num % 10;
            num = num / 10;

        }
        temp += num;
        return addDigits(temp);
    }

    public static void main(String[] args) {
        AddDigits258 a = new AddDigits258();
        System.out.println(a.addDigits(123));// 3+8 = 11 -> 1+1 = 2
    }

}

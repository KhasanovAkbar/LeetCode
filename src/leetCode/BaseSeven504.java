package leetCode;

public class BaseSeven504 {
    public String convertToBase7(int num) {
        //
        return Integer.toString(num, 7);
    }

    public static void main(String[] args) {
        BaseSeven504 b = new BaseSeven504();
        System.out.println(b.convertToBase7(100));//202
        System.out.println(b.convertToBase7(-7));//-10
    }
}

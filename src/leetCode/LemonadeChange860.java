package leetCode;

public class LemonadeChange860 {
    public boolean lemonadeChange(int[] bills) {
        //
        int five = 0, ten = 0;
        for (int bill : bills) {
            if (bill == 5) five++;
            else if (bill == 10) {
                five--;
                ten++;
                if (five < 0) return false;
            } else {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (ten == 0 && five - 3 >= 0)
                    five -= 3;
                else
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LemonadeChange860 l = new LemonadeChange860();
//        int[] temp = {5, 5, 5, 10, 20};
        int[] temp = {5, 5, 10, 10, 20};
        System.out.println(l.lemonadeChange(temp));//true
    }
}

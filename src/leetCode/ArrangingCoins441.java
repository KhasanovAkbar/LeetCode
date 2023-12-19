package leetCode;

public class ArrangingCoins441 {

    public int arrangeCoins(int n) {
        //
        int rowOfCoin = 0;
        int temp = n;
        for (int i = 1; i <= n; i++) {
            if ((temp - i) == 0) {
                rowOfCoin = i;
                break;
            } else if ((temp - i) < 0){
                rowOfCoin = i;
                rowOfCoin--;
                break;
            }
            else temp -= i;
        }
      /*  if (n == 0) return 0;
        while (n >= 0) {
            n = n - rowOfCoin++;
            if (n - rowOfCoin < 0) {
                rowOfCoin--;
                break;
            } else
                arrangeCoins(n);
        }*/

        return rowOfCoin;
    }

    public static void main(String[] args) {
        ArrangingCoins441 a = new ArrangingCoins441();
        System.out.println(a.arrangeCoins(3)); //3
    }
}

package leetCode;

public class Onebitand2bitCharacters717 {
    public boolean isOneBitCharacter(int[] bits) {
        //
        int count = 0;
        int n = bits.length;
        for (int i = n - 2; i >= 0; i--) {
            if (bits[i] != 0)
                count++;
        }
        return (count % 2 == 0);
    }

    public static void main(String[] args) {
        Onebitand2bitCharacters717 o = new Onebitand2bitCharacters717();
        int[] bit = { 1, 0, 0};
        System.out.println(o.isOneBitCharacter(bit));//false
    }
}

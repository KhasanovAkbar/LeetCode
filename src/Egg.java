public class Egg {
    private int number = 3;
    {number =  4;}
    public Egg(){
        number = 5;
    }


    public static void main(String[] args) {
        Egg egg = new Egg();
        int a = (short) 3;
        long s = 13_13_13_13;
        byte hat = 1;
        byte gloves =(byte) (7 * 100);
        short scarf = 5;
        short boots = 2 + 1;
        System.out.println(hat);
    }


}

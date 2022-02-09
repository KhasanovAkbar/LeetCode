package leetCode;

public class SimpleMaxraj {

    public static void main(String[] args) {
        double res = 0.0;
        for (int i = 103; i>0; i-=2){
            res = 1.0/(i+res);
        }
        System.out.println(res);
    }
}

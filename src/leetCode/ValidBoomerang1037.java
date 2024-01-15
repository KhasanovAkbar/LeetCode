package leetCode;

public class ValidBoomerang1037 {
    public boolean isBoomerang(int[][] points) {
        //
        //(x1,y1), (x2,y2), (x3,y3)
        // [x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)] !=0
       return (points[0][0] * (points[1][1] - points[2][1]) +
               points[0][1] * (points[2][1] - points[0][1]) +
               points[2][0] * (points[0][1] - points[1][1]) != 0);
    }

    public static void main(String[] args) {
        ValidBoomerang1037 v = new ValidBoomerang1037();
        int[][] nums = {{1, 1}, {2, 3}, {3, 2}};
        System.out.println(v.isBoomerang(nums));
    }
}

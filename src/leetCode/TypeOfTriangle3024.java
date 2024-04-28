package leetCode;

public class TypeOfTriangle3024 {
    public String triangleType(int[] nums) {
        //
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];

        if (a + b <= c || a + c <= b || b + c <= a) {
            return "none";
        } else if (a == b && b == c) {
            return "equilateral";
        } else if (a == b || b == c || a == c) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }

    public static void main(String[] args) {
        //
        TypeOfTriangle3024 t = new TypeOfTriangle3024();
        int[] nums = {3, 4, 5};
        System.out.println(t.triangleType(nums));
    }
}

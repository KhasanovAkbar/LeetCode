package leetCode;

public class ValidMountainArray941 {
    public boolean validMountainArray(int[] arr) {
        //
        if (arr.length <= 2) return false;
        int l = 0;
        int r = arr.length - 1;
        while(l + 1 < arr.length - 1 && arr[l] < arr[l + 1]) l++;
        while(r - 1 > 0 && arr[r] < arr[r - 1]) r--;
        return l == r;
    }

    public static void main(String[] args) {
        ValidMountainArray941 v = new ValidMountainArray941();
//        int[] nums = {0, 3, 2, 1};
//        int[] nums = {0, 3, 5, 5};
        int[] nums = {3, 0, 3};
        System.out.println(v.validMountainArray(nums));//true
    }
}

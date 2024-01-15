package leetCode;

public class ValidMountainArray941 {
    public boolean validMountainArray(int[] arr) {
        //
        int leg = arr.length;
        int maxIndex=0;
        for (int i = 0; i < leg ; i++) {
            if(arr[i]>arr[maxIndex]) {
                maxIndex = i;
            }
        }
        if(maxIndex== 0 || maxIndex == leg-1) {
            return false;
        }
        for (int i = 0 ; i < maxIndex ; i++) {
            if(arr[i]>=arr[i+1]) {
                return false;
            }
        }
        for (int i = maxIndex ; i < leg-1 ; i++) {
            if(arr[i]<=arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidMountainArray941 v = new ValidMountainArray941();
        int[] nums = {0, 3, 2, 1};
//        int[] nums = {0, 3, 5, 5};
//        int[] nums = {3, 0, 3};
        System.out.println(v.validMountainArray(nums));//true
    }
}

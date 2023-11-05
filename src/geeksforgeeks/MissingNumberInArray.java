package geeksforgeeks;

import java.util.Arrays;

public class MissingNumberInArray {
    int missingNumber(int array[], int n) {
        //
        return ((1 + n) * n / 2) - Arrays.stream(array).sum();
    }

    public static void main(String[] args) {
        //
        MissingNumberInArray m = new MissingNumberInArray();
        int arr[] = {1,2,3,5};
        int n = 5;
        System.out.println(m.missingNumber(arr, n));
    }
}

package geeksforgeeks;

import java.util.Arrays;

public class SecondLargest {
    int print2largest(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] != arr[i - 1])
                return arr[i - 1];
        }
        return -1;

    }

    public static void main(String[] args) {
        SecondLargest s = new SecondLargest();
        int[] a = {12, 35, 1, 10, 34, 1};
        System.out.println(s.print2largest(a, 6));
    }
}

package geeksforgeeks;

import java.util.ArrayList;

public class SubarrayWithGivenSum {
    //Function to find a continuous sub-array which adds up to a given number.
    public ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        //
        ArrayList<Integer> ans = new ArrayList<>();

        int index1 = 0;
        int index2 = 0;
        int sum = 0;
        while (index2 < n) {
            sum += arr[index2];

            while (index1 < index2 && sum > s) {
                sum -= arr[index1];
                index1++;
            }

            while (s == sum ) {
                ans.add(index1 + 1);
                ans.add(index2 + 1);
                return ans;
            }
            index2++;
        }
        ans.add(-1);
        return ans;

    }

    public static void main(String[] args) {
        SubarrayWithGivenSum s = new SubarrayWithGivenSum();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = 10;
        int sum = 24;
        ArrayList<Integer> integers = s.subarraySum(arr, n, sum);
        for (Integer item : integers) {
            System.out.print(item + " ");
        }
    }
}

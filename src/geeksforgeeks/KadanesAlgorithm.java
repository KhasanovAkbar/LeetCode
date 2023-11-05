package geeksforgeeks;

public class KadanesAlgorithm {
    long maxSubarraySum(int arr[], int n) {
        //
        long max_so_far = Integer.MIN_VALUE, max_ending_here = 0L;
        for (int i = 0; i < n; i++) {
            max_ending_here += arr[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    public static void main(String[] args) {
        //
        KadanesAlgorithm k = new KadanesAlgorithm();
        int[] arr = {1, 2, 3, -2, 5};
        int n = 5;
        System.out.println(k.maxSubarraySum(arr, n));
    }
}

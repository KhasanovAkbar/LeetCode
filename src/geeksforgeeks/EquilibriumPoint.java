package geeksforgeeks;

public class EquilibriumPoint {
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
        //
        int sum = 0, lSum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];

        for (int i = 0; i < n; i++) {
            if ((sum - arr[i]) == lSum) {
                return i + 1;
            }
            lSum += arr[i];
            sum -= arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        long[] arr = {1, 3, 5, 2, 2};
        System.out.println(equilibriumPoint(arr, 5));
    }
}

package geeksforgeeks;

public class CountInversions {
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long mergeAndCount(long[] arr, long[] temp, int left, int mid, int right) {
        long count = 0;

        int i = left;
        int j = mid;
        int k = left;

        while (i <= mid - 1 && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count += (mid - i);
            }
        }

        while (i <= mid - 1) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return count;
    }

    static long mergeSortAndCount(long[] arr, long[] temp, int left, int right) {
        long count = 0;

        if (left < right) {
            int mid = (left + right) / 2;
            count += mergeSortAndCount(arr, temp, left, mid);
            count += mergeSortAndCount(arr, temp, mid + 1, right);
            count += mergeAndCount(arr, temp, left, mid + 1, right);
        }

        return count;
    }

    static long inversionCount(long[] arr, long N) {
        int n = arr.length;
        long[] temp = new long[n];

        return mergeSortAndCount(arr, temp, 0, n - 1);
    }

   /* static long inversionCount(long arr[], long N) {
        // Your Code Here
        long sum = 0;
        for (int i = 0; i < N-1; i++)
            for (int j = i + 1; j < N; j++)
                if (arr[i] > arr[j])
                    sum++;


        return sum;
    }*/

    public static void main(String[] args) {
        long[] arr = {2, 4, 1, 3, 5};
        System.out.println(inversionCount(arr, 5));
    }
}

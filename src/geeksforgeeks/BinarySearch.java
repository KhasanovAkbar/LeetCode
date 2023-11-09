package geeksforgeeks;

public class BinarySearch {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int index = -1;
        if (n > 1) {
            if (arr[0] > k || arr[n - 1] < k)
                return -1;
            int low = 0, high = n - 1;
            while (low <= high) {
                int mid = low + ((high - low) / 2);
                if (arr[mid] == k) {
                    index = mid;
                    break;
                } else if (arr[mid] < k)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        } else if (arr[0] == k)
            index = 0;

        return index;
    }

    public static void main(String[] args) {
        BinarySearch b = new BinarySearch();
        int[] arr = {4};
        System.out.println(b.binarysearch(arr, 1, 5));
    }

}

package geeksforgeeks;

public class PeakElement {
    // Function to find the peak element
    // arr[]: input array
    // n: size of array a[]
    public int peakElement(int[] arr, int n) {
        //add code here
        int index = 0;
        if (n == 1)
            return 0;
        if (arr[0] > arr[1])
            return 0;
        if (arr[n - 1] > arr[n - 2])
            return n - 1;
        for (int i = 1; i < n - 1; i++) {

            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
                return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        PeakElement p = new PeakElement();
        int[] arr = {1, 2, 3};
        System.out.println(p.peakElement(arr, 3));
    }
}

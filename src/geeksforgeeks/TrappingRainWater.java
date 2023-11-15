package geeksforgeeks;

public class TrappingRainWater {
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) {
        // Your code here

        if (n <= 2) return 0;

        int left_index = 0, right_index = 1;
        long sum = 0;

        for (int i = 1; i < n; i++) {

            while (i < n && arr[i] <= arr[left_index]) {
                i++;
                if (i < n && arr[i] >= arr[right_index]) right_index = i;
            }

            if (Math.abs(left_index - right_index) <= 1) {
                left_index = right_index;
                right_index += 1;
                i = left_index;
                continue;
            }

            int min_height = Math.min(arr[left_index], arr[right_index]);
            left_index++;
            while (left_index != right_index) {
                sum += (min_height - arr[left_index]);
                left_index++;
            }
            right_index += 1;
            i = left_index;
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] arr = {7, 4, 0, 9, 3, 0, 0, 2, 0, 8, 4};
        System.out.println(trappingWater(arr, 11));
    }
}

package geeksforgeeks;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n) {
        // Your code here
/*        long[] result = new long[n];
        int index = 0;
        for (int i = 0; i < n - 1; i++) {
            int j = 2;
            if (arr[i] < arr[i + 1]) {
                result[index] = arr[i + 1];
                index++;
            } else {
                while ((i + j) < n) {
                    if (arr[i] < arr[i + j]) {
                        result[index] = arr[i + j];
                        index++;
                        break;
                    }
                    j++;
                }
                if ((i + j) == n) {
                    result[index] = -1;
                    index++;
                }
            }
        }
        result[n - 1] = -1;
        return result;*/
        long[] result = new long[n];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        long[] arr = {6, 8, 0, 1, 3};
        long[] longs = nextLargerElement(arr, 5);
        for (long aLong : longs) {
            System.out.print(aLong + " ");
        }
    }
}

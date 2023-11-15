package geeksforgeeks;

public class FindMissingAndRepeating {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int[] temp = new int[n];
        int[] result = new int[2];

        for (int i = 0; i < n; i++) {
            temp[arr[i] - 1]++;
            if (temp[arr[i] - 1] > 1) {
                result[0] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (temp[i] == 0) {
                result[1] = i + 1;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FindMissingAndRepeating f = new FindMissingAndRepeating();
        int arr[] = {13, 33, 43, 16, 25, 19, 23, 31, 29, 35, 10, 2, 32, 11, 47, 15, 34, 46, 30, 26, 41, 18, 5, 17, 37, 39, 6, 4, 20, 27, 9, 3, 8, 40, 24, 44, 14, 36, 7, 38, 12, 1, 42, 12, 28, 22, 45};
        int[] twoElement = f.findTwoElement(arr, 47);
        for (int i = 0; i < twoElement.length; i++) {
            System.out.print(twoElement[i] + " ");
        }
    }
}

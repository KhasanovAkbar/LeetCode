package geeksforgeeks;

public class MajorityElement {
    //Boyer-Moore Majority vote Algorithm
    //Time complexity O(N)
    //Space complexity O(1)
    static int majorityElement(int a[], int size) {
        //
        int count = 1;
        int majorityElement = a[0];

        for (int i = 1; i < size; i++) {
            if (a[i] == majorityElement)
                count++;
            else
                count--;

            if (count == 0) {
                majorityElement = a[i];
                count = 1;
            }
        }

        count = 0;
        for (int i = 0; i < size; i++) {
            if (a[i] == majorityElement) {
                count++;
            }
        }
        if (count > size / 2)
            return majorityElement;
        else
            return -1;

    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 3, 2};
        System.out.println(majorityElement(arr, 5));
    }
}

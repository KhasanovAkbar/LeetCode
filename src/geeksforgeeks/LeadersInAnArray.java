package geeksforgeeks;

import java.util.ArrayList;

public class LeadersInAnArray {
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n) {
        //
        ArrayList<Integer> list = new ArrayList<>();
        if (n > 1) {
            for (int i = 0; i < n - 1; i++) {
                int temp = 0;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] >= arr[j])
                        temp++;
                    else break;
                }
                if (temp == (n - i - 1))
                    list.add(arr[i]);
            }
            list.add(arr[n - 1]);
        } else {
            list.add(arr[0]);
        }
        return list;

    }

    public static void main(String[] args) {
        int[] arr = {2575, 8256};
        ArrayList<Integer> leaders = leaders(arr, 2);
        for (int i = 0; i < leaders.size(); i++) {
            System.out.print(leaders.get(i) + " ");
        }
    }
}

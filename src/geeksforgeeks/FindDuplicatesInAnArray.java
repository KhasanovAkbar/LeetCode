package geeksforgeeks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class FindDuplicatesInAnArray {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        HashSet<Integer> uniqueList = new HashSet<>();
        HashSet<Integer> uniqueValues = new HashSet<>();
        int i = 0;
        while (i < n) {
            if (!uniqueValues.add(arr[i]))
                uniqueList.add(arr[i]);
            i++;
        }
        ArrayList<Integer> list = new ArrayList<>(uniqueList);


        list.sort(Comparator.naturalOrder());
        if (list.size() == 0)
            list.add(-1);
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 12, 3, 12, 3, 4, 4, 12, 7, 11, 6, 5};
        int n = 13;
        ArrayList<Integer> duplicates = duplicates(arr, n);
        for (Integer duplicate : duplicates) {
            System.out.print(duplicate + " ");
        }
    }
}

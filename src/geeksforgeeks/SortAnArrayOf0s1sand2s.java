package geeksforgeeks;

public class SortAnArrayOf0s1sand2s {
    public static void sort012(int a[], int n) {
        //
        int c0 = 0, c1 = 0, c2 = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0)
                c0++;
            else if (a[i] == 1)
                c1++;
            else c2++;
        }
        int i = 0;
        while (i < c0) {
            a[i] = 0;
            i++;
        }
        while (i < (c0 + c1)) {
            a[i] = 1;
            i++;
        }
        while (i < (c0 + c1 + c2)) {
            a[i] = 2;
            i++;
        }
    }
}

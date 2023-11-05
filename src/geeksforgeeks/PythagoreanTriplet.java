package geeksforgeeks;

public class PythagoreanTriplet {
    boolean checkTriplet(int[] arr, int n) {
        // code here
        boolean result = false;
        if (arr.length > 2) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        if (i == j || i == k || j == k)
                            break;

                        result = triplet(arr[i], arr[j], arr[k]);
                        if (result)
                            break;
                    }
                    if (result)
                        break;
                }
                if (result)
                    break;
            }
        }
        return result;
    }

    private boolean triplet(int a, int b, int c) {
        if (a * a == b * b + c * c) return true;
        else if (b * b == a * a + c * c) return true;
        else return c * c == a * a + b * b;

    }

    public static void main(String[] args) {
        PythagoreanTriplet p = new PythagoreanTriplet();
        int arr[] = {3, 8, 5};
        int n = 3;
        System.out.println(p.checkTriplet(arr, n));
    }
}

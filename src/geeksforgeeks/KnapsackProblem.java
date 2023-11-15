package geeksforgeeks;

public class KnapsackProblem {
    static int knapSack(int W, int wt[], int val[], int n) {
        // your code here

        //Recursive
        //Time Complexity: O(2^N)
       /* if (n == 0 || W == 0)
            return 0;

        if (wt[n - 1] > W)
            return knapSack(W, wt, val, n - 1);
        else
            return max(val[n - 1]
                            + knapSack(W - wt[n - 1], wt, val, n - 1),
                    knapSack(W, wt, val, n - 1));

    }

    static int max(int a, int b) {
        return (a > b) ? a : b;
        }
*/

        //Dynamic programming
        int i, w;
        int K[][] = new int[n + 1][W + 1];

        // Build table K[][] in bottom up manner
        for (i = 0; i <= n; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (wt[i - 1] <= w)
                    K[i][w]
                            = Math.max(val[i - 1]
                                    + K[i - 1][w - wt[i - 1]],
                            K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }

        return K[n][W];
    }

    public static void main(String[] args) {
        int profit[] = new int[]{60, 100, 120};
        int weight[] = new int[]{10, 20, 30};
        int W = 50;
        System.out.println(knapSack(W, weight, profit, 3));
    }

}

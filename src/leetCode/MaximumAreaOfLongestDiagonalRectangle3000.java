package leetCode;

public class MaximumAreaOfLongestDiagonalRectangle3000 {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        //
        int diagSq = 0, area = 0;
        for (int[] dimension : dimensions) {
            int ds = dimension[0] * dimension[0] + dimension[1] * dimension[1];
            int ar = dimension[0] * dimension[1];
            if (ds > diagSq) {
                diagSq = ds;
                area = ar;
            } else if (ds == diagSq) {
                area = Math.max(area, ar);
            }
        }
        return area;
    }

    public static void main(String[] args) {
        //
        MaximumAreaOfLongestDiagonalRectangle3000 m = new MaximumAreaOfLongestDiagonalRectangle3000();
//        int[][] dimensions = {{9, 3}, {8, 6}};
//        int[][] dimensions = {{4, 3}, {3, 4}};
//        int[][] dimensions = {{9, 9}, {1, 8}, {10, 5}, {2, 8}, {6, 3}, {7, 1}};
        int[][] dimensions = {{1, 10}, {3, 10}, {4, 4}, {2, 6}, {6, 3}, {6, 4}, {9, 1}, {6, 1}, {2, 3}};
        System.out.println(m.areaOfMaxDiagonal(dimensions));
    }
}

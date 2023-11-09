package geeksforgeeks;

import java.util.ArrayList;

public class PrintMatrixInSnakePattern {
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        // code here
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    arrayList.add(matrix[i][j]);
                }
            } else {
                for (int j = matrix[i].length-1; j >= 0; j--) {
                    arrayList.add(matrix[i][j]);
                }
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        int[][] matrix = {{45, 48, 54},
                {21, 89, 87},
                {70, 78, 15}};
        for (Integer integer : snakePattern(matrix)) {
            System.out.print(integer + " ");
        }

    }
}
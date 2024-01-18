package leetCode;

public class MatrixElementsSum {
    int solution(int[][] matrix) {
        //
        var total = 0;
        for (var i = 0; i < matrix[0].length; i++) {
            for (var j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 0) {
                    break;
                }
                total += matrix[j][i];
            }
        }

        return total;
    }

    public static void main(String[] args) {
        MatrixElementsSum m = new MatrixElementsSum();
        int[][] nums = {{0, 1, 1, 2},
                        {0, 5, 0, 0},
                       {2, 0, 3, 3}};
        System.out.println(m.solution(nums));

    }
}

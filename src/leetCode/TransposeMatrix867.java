package leetCode;

public class TransposeMatrix867 {
    public int[][] transpose(int[][] matrix) {
        //
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}};
        TransposeMatrix867 t = new TransposeMatrix867();
        int[][] transpose = t.transpose(nums);
        for (int[] ints : transpose) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}

package leetCode;

public class ReshapeTheMatrix566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        //
        int oldRow = mat.length;
        int oldColumn = mat[0].length;
        if (oldRow * oldColumn != r * c) return mat;
        int[][] newMat = new int[r][c];
        int newI = 0;
        int newJ = 0;
        for (int[] ints : mat) {
            for (int anInt : ints) {
                if (newI < r) {
                    if (newJ < c) {
                        newMat[newI][newJ] = anInt;
                        newJ++;
                    } else {
                        newJ = 0;
                        newI++;
                        newMat[newI][newJ] = anInt;
                        newJ++;
                    }
                }
            }
        }
        return newMat;
    }

    public static void main(String[] args) {
        ReshapeTheMatrix566 r = new ReshapeTheMatrix566();
        int[][] nums = {{1, 2, 3}, {4, 5, 6}};
        int[][] ints = r.matrixReshape(nums, 3, 2);
        for (int[] item : ints) {
            for (int anInt : item) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}

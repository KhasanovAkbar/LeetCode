package leetCode;

public class FlippingImage832 {
    public int[][] flipAndInvertImage(int[][] image) {
        //
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length / 2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][image.length - 1 - j];
                image[i][image.length - 1 - j] = temp;
            }
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 1)
                    image[i][j] = 0;
                else
                    image[i][j] = 1;
            }
        }


        return image;
    }

    public static void main(String[] args) {
        FlippingImage832 f = new FlippingImage832();
        int[][] nums = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] ints = f.flipAndInvertImage(nums);
        for (int[] anInt : ints) {
            for (int i : anInt) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

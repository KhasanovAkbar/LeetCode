package leetCode;

public class ContainerWithMostWater11 {
    public int maxArea(int[] height) {
        //
        int left = 0;
        int right = height.length -1;
        int area = 0;

        while (left < right)
        {
            // Calculating the max area
            area = Math.max(area,
                    Math.min(height[left], height[right]) * (right - left));

            if (height[left] < height[right])
                left += 1;

            else
                right -= 1;
        }
        return area;
    }

    public static void main(String[] args) {
        ContainerWithMostWater11 c = new ContainerWithMostWater11();
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7}; // 8 -> 7 => 7*7 = 49
        System.out.println(c.maxArea(arr));
    }
}

package leetCode;

public class SortArrayByParity905 {
    public int[] sortArrayByParity(int[] nums) {
        //
        if (nums.length == 1) return nums;
        int start = 0, end = nums.length - 1;
        while (start < end) {
            if (nums[start] % 2 != 0 && nums[end] % 2 == 0) {
                int temp = nums[end];
                nums[end] = nums[start];
                nums[start] = temp;
                start++;
                end--;
            } else if (nums[start] % 2 != 0 && nums[end] % 2 != 0) {
                end--;
            } else if (nums[start] % 2 == 0 && nums[end] % 2 == 0) {
                start++;
            } else {
                start++;
                end--;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        SortArrayByParity905 s = new SortArrayByParity905();
        int[] nums = {0, 1};
        int[] ints = s.sortArrayByParity(nums);

        for (int anInt : ints) {
            System.out.print(anInt + " ");//[2,4,3,1], [4,2,3,1], [2,4,1,3] and [4,2,1,3]
        }
    }
}

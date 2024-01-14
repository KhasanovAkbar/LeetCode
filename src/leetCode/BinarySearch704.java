package leetCode;

public class BinarySearch704 {
    public int search(int[] nums, int target) {
        //
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) right = mid - 1;
            else if (nums[mid] < target) left = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch704 b = new BinarySearch704();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        System.out.println(b.search(nums, 9));//4
    }
}

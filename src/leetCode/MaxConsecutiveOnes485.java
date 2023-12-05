package leetCode;

public class MaxConsecutiveOnes485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        //
        int consecutive = 0;
        int temp = 0;
        for (int item : nums) {
            if (item == 0)
                temp = 0;
            else {
                temp++;
                consecutive = Math.max(temp, consecutive);
            }
        }
        return consecutive;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes485 m = new MaxConsecutiveOnes485();
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(m.findMaxConsecutiveOnes(nums));
    }
}

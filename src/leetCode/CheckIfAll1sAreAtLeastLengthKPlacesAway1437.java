package leetCode;

public class CheckIfAll1sAreAtLeastLengthKPlacesAway1437 {
    public boolean kLengthApart(int[] nums, int k) {
        //
        int lastOneIndex = -1;
        boolean result = true;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                if(lastOneIndex != -1 && i - lastOneIndex - 1 < k){
                    result = false;
                    break;
                }
                lastOneIndex = i;
            }
        }

        return result;
      /*  int count = 0;
        for (int num : nums) {
            if (num == 1) {
                if (count < k && count != 0) {
                    return false;
                }
                count = 0;
            } else {
                count++;
            }
        }
        return true;*/
    }

    public static void main(String[] args) {
        CheckIfAll1sAreAtLeastLengthKPlacesAway1437 c = new CheckIfAll1sAreAtLeastLengthKPlacesAway1437();
//        int[] nums = {1, 0, 0, 0, 1, 0, 0, 1};
        int[] nums = {1,1,1,0};
        int k = 2;
        System.out.println(c.kLengthApart(nums, k));
    }
}

package leetCode;

public class SplitTheArray3046 {
    public boolean isPossibleToSplit(int[] nums) {
        //
       /* boolean result = true;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            if (hashMap.get(num) != null && hashMap.get(num) >= 2) {
                result = false;
                break;
            } else {
                hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
            }
        }
        return result;*/

        int[] count = new int[101];
        for (int num : nums) {
            count[num - 1]++;
            if (count[num - 1] > 2)
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        //
        SplitTheArray3046 s = new SplitTheArray3046();
        int[] nums = {1, 1, 1, 1, 1, 1};
        System.out.println(s.isPossibleToSplit(nums));
    }
}

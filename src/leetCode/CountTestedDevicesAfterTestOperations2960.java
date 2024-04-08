package leetCode;

public class CountTestedDevicesAfterTestOperations2960 {
    public int countTestedDevices(int[] batteryPercentages) {
        //
        int count = 0;
        int i = 0;
        while (i < batteryPercentages.length) {
            if (batteryPercentages[i] > 0) {
                for (int j = i+1; j < batteryPercentages.length; j++) {
                    if (batteryPercentages[j] > 0)
                        batteryPercentages[j] -= 1;
                }
                count++;
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        CountTestedDevicesAfterTestOperations2960 c = new CountTestedDevicesAfterTestOperations2960();
        int[] batteryPercentages = {2, 1};
        System.out.println(c.countTestedDevices(batteryPercentages));
    }
}

package leetCode;

public class TeemoAttacking495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        //
        if (timeSeries.length == 1) return duration;
        int poison = duration;
        for (int i = 0; i < timeSeries.length-1; i++) {
            if ((timeSeries[i]+duration-1)<timeSeries[i+1])
                poison +=duration;
            else poison += timeSeries[i+1] - timeSeries[i];
        }
        return poison;
    }

    public static void main(String[] args) {
        TeemoAttacking495 t = new TeemoAttacking495();
//        int[] timeSeries = {1, 4};
        int[] timeSeries = {1, 2};
        int duration = 2;
        System.out.println(t.findPoisonedDuration(timeSeries, duration));
    }
}

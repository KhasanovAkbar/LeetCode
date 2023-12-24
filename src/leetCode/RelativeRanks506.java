package leetCode;

import java.util.*;

public class RelativeRanks506 {
    public String[] findRelativeRanks(int[] score) {
        //
        int[] temp = new int[score.length];
        System.arraycopy(score, 0, temp, 0, score.length);
        Arrays.sort(temp);
        Integer[] sortedScore = new Integer[temp.length];
        for (int i = 0; i < temp.length; i++) {
            sortedScore[i] = temp[i];
        }
        Arrays.sort(sortedScore, Comparator.reverseOrder());
        Map<Integer, Integer> scoreOfAthlete = new HashMap<>();
        int i = 0;
        while (i < sortedScore.length) {
            scoreOfAthlete.put(sortedScore[i], i);
            i++;
        }

        ArrayList<String> medals = new ArrayList<>();
        medals.add(0, "Gold Medal");
        medals.add(1, "Silver Medal");
        medals.add(2, "Bronze Medal");

        ArrayList<String> result = new ArrayList<>(score.length);


        for (int k : score) {
            if (scoreOfAthlete.get(k) < 3) {
                result.add(medals.get(scoreOfAthlete.get(k)));
            } else result.add(String.valueOf(scoreOfAthlete.get(k) + 1));
        }
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        RelativeRanks506 r = new RelativeRanks506();
//        int[] arr = {10, 3, 8, 9, 4};
        int[] arr = {5, 4, 3, 2, 1};
        for (String relativeRank : r.findRelativeRanks(arr)) //["Gold Medal","5","Bronze Medal","Silver Medal","4"]
            System.out.print(relativeRank + " ");


    }
}

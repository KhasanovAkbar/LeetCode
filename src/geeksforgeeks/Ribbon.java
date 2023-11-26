package geeksforgeeks;

import java.util.Arrays;

public class Ribbon {

    int solution(int[] a, int k) {
        //
        if (a.length == 0) return 0;

        int min = 1;
        int max = Arrays.stream(a).max().getAsInt();
        int count = 0;


        while (min <= max) {
            int avg = (max + min) / 2;

            if (item(a, avg) >= k) {
                count = avg;
                min = avg + 1;
            } else {
                max = avg - 1;
            }
        }

       /* int temp = 0;
        int counter = 2;
        int index = 0;
        while (counter < Arrays.stream(a).max().getAsInt()) {

            temp += a[index] / counter;
            index++;

            if (index == (a.length)) {
                if (temp == k)
                    break;
                else if (temp<k){
                    counter--;
                    break;
                }
                counter++;
                index = 0;
                temp = 0;
            }
        }
        return counter;*/
        return count;
    }

    private int item(int[] a, int index) {
        int count = 0;
        for (int item : a) {
            count += item / index;
        }
        return count;
    }

    public static void main(String[] args) {
        Ribbon r = new Ribbon();
        int[] a1 = {5, 2, 7, 4, 9}; //5 result 4
        int[] a2 = {1, 2, 3, 4, 9}; //6 result 2
        int[] a3 = {4, 4, 7, 1, 4, 9, 5, 5, 8, 4, 1, 1}; //2 result 8
        int[] a4 = {4, 8, 4, 5, 3, 7, 1, 2, 6}; //5 result 4
        //4
//        System.out.println(r.solution(a1, 5));
//        System.out.println(r.solution(a2, 6));
//        System.out.println(r.solution(a3, 2));
        System.out.println(r.solution(a4, 5));
    }
}

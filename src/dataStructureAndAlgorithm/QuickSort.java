package dataStructureAndAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuickSort {

    int partition(int intArray[], int low, int high) {
        int pi = intArray[high];
        int i = (low-1); // smaller element index
        for (int j=low; j<high; j++) {
            // check if current element is less than or equal to pi
            if (intArray[j] <= pi) {
                i++;
                // swap intArray[i] and intArray[j]
                int temp = intArray[i];
                intArray[i] = intArray[j];
                intArray[j] = temp;
            }
        }

        // swap intArray[i+1] and intArray[high] (or pi)
        int temp = intArray[i+1];
        intArray[i+1] = intArray[high];
        intArray[high] = temp;

        return i+1;
    }


    //routine to sort the array partitions recursively
    void quick_sort(int intArray[], int low, int high) {
        if (low < high) {
            //partition the array around pi=>partitioning index and return pi
            int pi = partition(intArray, low, high);

            // sort each partition recursively
            quick_sort(intArray, low, pi-1);
            quick_sort(intArray, pi+1, high);
        }
    }
  /*  ArrayList<Integer> qSort(ArrayList<Integer> array) {
        ArrayList<Integer> kichik = new ArrayList<>();
        int pivot = 0;
        ArrayList<Integer> katta = new ArrayList<>();
        if (array.size() < 2) return array;
        else {
            pivot = array.get(new Random().nextInt(array.size()));

            for (Integer integer : array) {
                if (integer <= pivot) kichik.add(integer);
                else katta.add(integer);
            }
        }
        return qSort(kichik).qSort(katta);
    }*/
}

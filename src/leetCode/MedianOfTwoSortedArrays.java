package leetCode;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double answer;
        int[] newArray = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                newArray[k] = nums1[i];
                i++;
                k++;
            } else if (nums1[i] > nums2[j]) {
                newArray[k] = nums2[j];
                j++;
                k++;
            } else {
                newArray[k] = nums1[i];
                k++;
                i++;
                newArray[k] = nums2[j];
                k++;
                j++;
            }
        }

        while (i != nums1.length) {
            newArray[k] = nums1[i];
            k++;
            i++;
        }

        while (j != nums2.length) {
            newArray[k] = nums2[j];
            k++;
            j++;
        }

        if (newArray.length % 2 == 0) {
            int mid = newArray.length / 2;
            answer = (newArray[mid] +newArray[mid-1])/2.0;
            return answer;
        }

        int mid = newArray.length/2;
        answer = newArray[mid];
        return answer;
    }
}

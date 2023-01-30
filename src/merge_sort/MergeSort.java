package merge_sort;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }

        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right, mid, right.length);
    }

    public static void merge(
            int[] arr, int[] left, int[] right, int mid, int rightLength) {

        int i = 0, j = 0, k = 0;
        while (i < mid && j < rightLength) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < mid) {
            arr[k++] = left[i++];
        }
        while (j < rightLength) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 5, 8, 1, 3, 6};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));


    }
}

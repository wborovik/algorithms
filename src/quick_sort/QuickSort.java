package quick_sort;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            int leftIndex = low;
            int rightIndex = high;
            int pivot = arr[low + (high - low) / 2];

            while (leftIndex <= rightIndex) {
                while (arr[leftIndex] < pivot) {
                    leftIndex++;
                }

                while (arr[rightIndex] > pivot) {
                    rightIndex--;
                }

                if (leftIndex <= rightIndex) {
                    int tmp = arr[rightIndex];
                    arr[rightIndex] = arr[leftIndex];
                    arr[leftIndex] = tmp;

                    leftIndex++;
                    rightIndex--;
                }
            }
            quickSort(arr, low, leftIndex - 1);
            quickSort(arr, leftIndex, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 5, 8, 1, 3, 6};
        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}

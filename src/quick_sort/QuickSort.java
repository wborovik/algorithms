package quick_sort;

import java.util.Arrays;

public class QuickSort {

    static void quickSort(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int pivot = (low + high) / 2;
        int leftIndex = low;
        int rightIndex = high;

        while (leftIndex <= rightIndex) {
            while (arr[leftIndex] < arr[pivot]) {
                leftIndex++;
            }
            while (arr[rightIndex] > arr[pivot]) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                int temp = arr[leftIndex];
                arr[leftIndex] = arr[rightIndex];
                arr[rightIndex] = temp;

                leftIndex++;
                rightIndex--;
            }
        }
        quickSort(arr, low, rightIndex);
        quickSort(arr, leftIndex, arr.length - 1);
    }


    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 5, 8, 1, 3, 6};
        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}

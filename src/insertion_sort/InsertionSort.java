package insertion_sort;

import java.util.Arrays;

public class InsertionSort {
    static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 10, 1, 4, -7, 3, 12, -10, 100};
        int[] arr0 = new int[]{};
        int[] arr1 = new int[]{1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(insertionSort(arr)));
    }
}

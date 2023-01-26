package bubble_sort;

import java.util.Arrays;

public class BubbleSort {
    // Пример пузырьковой сортировки
    static int[] bubbleSort(int[] arr) {
        boolean isSort = false;
        while (!isSort) {
            isSort = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    isSort = false;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 10, 1, 4, -7, 3, 12};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}

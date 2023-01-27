package bubble_sort;

import java.util.Arrays;

public class BubbleSort {
    // Пример пузырьковой сортировки.
    static int[] bubbleSort(int[] arr) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    isSorted = false;
                }
            }
        }
        return arr;
    }

    // Еще один вариант пузырьковой сортировки.
    static int[] bubbleSort1(int[] arr) {
        for (int i = arr.length - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    // Немного по другому чем предыдущий вариант. Без обратного цикла.
    static int[] bubbleSort2(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < (arr.length - 1) - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 10, 1, 4, -7, 3, 12};
        int[] arr1 = new int[]{2, 10, 1, 4, -7, 3, 12};
        int[] arr2 = new int[]{2, 10, 1, 4, -7, 3, 12};

        System.out.println(Arrays.toString(bubbleSort(arr)));
        System.out.println(Arrays.toString(bubbleSort1(arr1)));
        System.out.println(Arrays.toString(bubbleSort2(arr2)));
    }
}

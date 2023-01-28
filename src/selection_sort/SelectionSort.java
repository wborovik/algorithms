package selection_sort;

import java.util.Arrays;

public class SelectionSort {

    // Моя реализация сортировки выбором.
    static int[] selectionSort(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    int temp = arr[i];
                    arr[i] = min;
                    arr[j] = temp;
                }
            }
            min = arr[i + 1];
        }
        return arr;
    }


    // Реализация из видео Сергея Архипова.
    static int[] selectionSort1(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = min(arr, i);

            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        return arr;
    }

    private static int min(int[] arr, int i) {
        int minValue = arr[i];
        int minIndex = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (minValue > arr[j]) {
                minValue = arr[j];
                minIndex = j;
            }
        }
        return minIndex;
    }

    // Реализация Сергея Архипова в одном методе.
    static int[] selectionSort2(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 10, 1, 4, -7, 3, 12, -10};
        int[] arr1 = new int[]{2, 10, 1, 4, -7, 3, 12, -10};
        int[] arr2 = new int[]{2, 10, 1, 4, -7, 3, 12, -10};

        System.out.println(Arrays.toString(selectionSort(arr)));
        System.out.println(Arrays.toString(selectionSort1(arr1)));
        System.out.println(Arrays.toString(selectionSort2(arr2)));
    }
}

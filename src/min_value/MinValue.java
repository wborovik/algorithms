package min_value;

public class MinValue {
    // Алгоритм для нахождения минимального значения в массиве.
    static int min(int[] arr) {
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    // По аналогии можем найти максимальное значение в массиве
    static int max(int[] arr) {
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    // Используя данный алгоритм можем найти индекс min/max значения.
    static int minIndex(int[] arr) {
        int minIndex = 0;
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 10, 1, 4, -7, 3, 12};
        System.out.println(min(arr));
        System.out.println(max(arr));
        System.out.println(minIndex(arr));
    }
}

package binary_search;

public class BinarySearch {
    static int binarySearch(int[] arr, int number) {
        int low = 0;
        int high = arr.length;
        int middle;
        for (int i = 0; i < arr.length/2; i++) {
            middle = (low + high) / 2;
            if (arr[middle] == number) {
                return middle;
            }
            if (number > arr[middle]) {
                low = middle;
            } else {
                if (number < arr[middle]) {
                    high = middle;
                }
            }
        }
        return -1;
    }

    static int binarySearch2(int[] arr, int number) {
        int low = 0;
        int high = arr.length - 1;
        int middle;
        while (low <= high) {
            middle = (low + high) / 2;
            if (arr[middle] == number) {
                return middle;
            }
            if (number > arr[middle]) {
                low = middle + 1;
            } else {
                if (number < arr[middle]) {
                    high = middle - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50, 70, 80};
        int number = 10;
        System.out.println(binarySearch2(arr, number));
        System.out.println(number == arr[binarySearch(arr, number)]);
    }
}

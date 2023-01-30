public class Main {
    int twoMaxValue(int[] arr) {
        int max = arr[0];
        int max2 = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max2 = max;
                max = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        return max2;
    }

    public static void main(String[] args) {
        Main m = new Main();
        int[] arr = new int[]{2, 5, 4, 77, 5, 4, 10, 25};
        System.out.println(m.twoMaxValue(arr));
    }
}
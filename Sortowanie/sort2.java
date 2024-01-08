import java.util.Arrays;

class Sort {
    public static void main(String args[]) {
        int[] arr = { 1, 5, 2, 4 };
        int n = arr.length;
        System.out.println("The original array is:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < n - 1; i++) {
            int min_i = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_i])
                    min_i = j;
            }
            int temp = arr[min_i];
            arr[min_i] = arr[i];
            arr[i] = temp;
        }

        System.out.println("\nThe sorted array (another way, but the same result) is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}

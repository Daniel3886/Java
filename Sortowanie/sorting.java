import java.util.Arrays;

class Sort {
    public static void main(String args[]) {
        int[] arr = { 1, 5, 2, 4 };
        System.out.println("The original array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nThe sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

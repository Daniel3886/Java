import java.util.Arrays;
import java.util.Scanner;

class NumberSorter {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dowolną ilość elementów");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Podaj liczby: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.print("The original array is: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        Arrays.sort(numbers);

        // public static final String ANSI_RESET = "\u001B[0m";

        System.out.print("\n\nSorted array is: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

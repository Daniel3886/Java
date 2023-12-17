import java.util.Scanner;

public class Matura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the value of n");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + " Liczba ");

            double ln1 = 0.0;
            for (int j = 0; j <= i; j++) {
                ln1 += (1.0 / (2 * j + 1)) * (1.0 / Math.pow(9, j));
            }
            ln1 = (2.0 / 3) * ln1;
            System.out.println("ln = " + ln1);
        }
    }
}

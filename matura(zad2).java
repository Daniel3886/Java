import java.util.Scanner;

public class Matura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj organizm jakiegokolwiek roku zycia, który chcesz zobaczyć");
        int age = scanner.nextInt();

        String result = getCharForNumber(age);
        String result1 = null;
        String result2 = null;
        String result3 = null;
        String result4 = null;

        if (age == 2) {
            result2 = getCharForNumber(age + 1);
            result3 = getCharForNumber(age + 2);
            System.out.println("Wyniki: " + result + " " + result2 + "\n\t" + result2 + " " + result3);
        } else if (age == 3) {
            result1 = getCharForNumber(age - 2);
            result2 = getCharForNumber(age + 1);
            result3 = getCharForNumber(age - 1);
            //result4 = getCharForNumber(age + 2);
            System.out.println("Wyniki: " + result1 + " " + result2 + " " + result3 + " " + result1+ "\n");
            System.out.println("Wyniki: " + result3 + " " + result1 + " " + result1 + " " + result1+ "\n");
            System.out.println("Wyniki: " + result3 + " " + result1 + " " + result3 + " " + result3+ "\n");
        } else {
            System.out.println("Wynik: " + result);
        }
    }

    private static String getCharForNumber(int i) {
        return (i > 0 && i < 27) ? String.valueOf((char) (i + 64)) : null;
    }
}

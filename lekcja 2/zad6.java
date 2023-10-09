import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj dochód roczny: ");
        double dochod = scanner.nextDouble();

        // Oblicz podatek na podstawie progów podatkowych
        double podatek;

        if (dochod <= 20000) {
            podatek = dochod * 0.10; // 10% podatku
        } else if (dochod <= 40000) {
            podatek = 2000 + (dochod * 0.15 - 3000); // 10% do 20 000 zł + 15% powyżej 20 000 zł
        } else if (dochod <= 60000) {
            podatek = 6000 + (dochod * 0.20 - 7000); // 10% do 20 000 zł + 15% od 20 000 zł do 40 000 zł + 20% powyżej 40 000 zł
        } else {
            podatek = 10000 + (dochod * 0.25 - 11000); // 10% do 20 000 zł + 15% od 20 000 zł do 40 000 zł + 20% od 40 000 zł do 60 000 zł + 25% powyżej 60 000 zł
        }

        System.out.println("Podatek do zapłacenia wynosi: " + podatek + " zł");
    }
}

    